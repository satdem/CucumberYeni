Feature:Student functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

    Scenario:
      And Click on the element in the left class
      |studentParent|
      |studentButton|
      And Click in the new exam form
      |addButton|

      When User sending the keys in the form content class
      |firstName|sati|
      |lastName|demirci|

      And Click in the new exam form
        | genderDropdown           |
        | option1                  |
        | gradeLevel               |
        | option1                  |
        | schoolDepartmentDropdown |
        | option1                  |
        | sectionDropdown          |
        | option1                  |
        | citizenshipDropdown      |
        | option1                  |
        | studentDocumentType      |
        | option1                  |

      When User sending the keys in the form content class
      |studentDocumentNumber|123644|

      And Click in the new exam form
      |representatives|
      |repAddBtn|
      |repSelect|
      |option1|
      When User sending the keys in the form content class
        |repFirstName|ahmet|
        |repLastName|deniz|
        |repMobilPhone|1236444444|
      And Click in the new exam form
        | repAddBtn2 |
        | saveButton     |
