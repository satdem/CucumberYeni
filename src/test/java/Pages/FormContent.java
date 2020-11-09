package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends _Parent{

    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public FormContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[2]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-select[@role='combobox'])[3]")
    private WebElement documentType;

    @FindBy(xpath = "//span[text()='Add']")
    private WebElement examsAddBtn;

    @FindBy (xpath="(//span[@class='mat-option-text'])[1]")
    private WebElement option1;
  @FindBy (xpath="(//span[@class='mat-option-text'])[2]")
    private WebElement option2;
  @FindBy (xpath="(//span[@class='mat-option-text'])[3]")
    private WebElement option3;
  @FindBy (xpath="(//span[@class='mat-option-text'])[4]")
    private WebElement option4;

    @FindBy(xpath="(//span[text()='Gender'])[1]")
    private WebElement genderDropdown;
    @FindBy(xpath="(//span[text()='School Department'])[1]")
    public WebElement schoolDepartmentDropdown;

    @FindBy(xpath="(//span[text()='Section'])[1]")
    private WebElement sectionDropdown;
    @FindBy(xpath="(//span[text()='Citizenship'])[1]")
    public WebElement citizenshipDropdown;
    @FindBy(xpath = "//span[text()='Document Type']")
    private WebElement studentDocumentType;
    @FindBy(xpath = "//input[@formcontrolname='documentNumber']")
    private WebElement studentDocumentNumber;

    @FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
    private WebElement representatives;

    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']")
    private WebElement repAddBtn;


    @FindBy(xpath = "//span[text()='Representative']")
    private WebElement repSelect;

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    private WebElement repFirstName;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    private WebElement repLastName;

    @FindBy(xpath = "//input[@formcontrolname='phone']")
    private WebElement repMobilPhone;

    @FindBy(xpath = "//span[text()=' Add ']")
    private WebElement repAddBtn2;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "addButton":
                myElement = addButton;
                break;
                case "academicPeriod":
                myElement = academicPeriod;
                break;

            case "gradeLevel":
                myElement = gradeLevel;
                break;

            case "documentType":
                myElement = documentType;
                break;

            case "examsAddBtn":
                myElement = examsAddBtn;
                break;

            case "option1":
                myElement = option1;
                break;
                case "option2":
                myElement = option2;
                break; case "option3":
                myElement = option3;
                break; case "option4":
                myElement = option4;
                break;

            case "saveButton":
                myElement = saveButton;
                break;
                case "genderDropdown":
                myElement = genderDropdown;
                break;
                case "schoolDepartmentDropdown":
                myElement = schoolDepartmentDropdown;
                break;
                case "sectionDropdown":
                myElement = sectionDropdown;
                break;
                case "citizenshipDropdown":
                myElement = citizenshipDropdown;
                break;
                case "representatives":
                myElement = representatives;
                break;

                case "studentDocumentType":
                myElement = studentDocumentType;
                break;
                case "repAddBtn":
                myElement = repAddBtn;
                break;
                case "repAddBtn2":
                myElement = repAddBtn2;
                break;

                case "repSelect":
                myElement = repSelect;
                break;


        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "nameInput":
                myElement = nameInput;
                break;
 case "repFirstName":
                myElement = repFirstName;
                break;
 case "repLastName":
                myElement = repLastName;
                break;
case "repMobilPhone":
                myElement = repMobilPhone;
                break;
            case "studentDocumentNumber":
                myElement = studentDocumentNumber;
                break;
        }

        sendKeysFunction(myElement, value);
    }

}
