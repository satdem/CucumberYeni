#Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName    | AcademicPeriodOption | GradeLevelOption | documentTypeOption |
#| Math exam   | Option2              | Option4          | Option4            |
#| IT exam     | Option1              | Option1          | Option1            |
#| Oracle exam | Option2              | Option2          | Option2            |
#| Math exam   | Option1              | Option3          | Option3            |

Feature:Entrance Exam functionality scenario outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario Outline:
    And Click on the element in the left class
      | entranceExamsParent |
      | entranceExamsSetup  |
      | entranceExamsChild  |

    And Click in the new exam form
      | addButton |

    When User sending the keys in the form content class
      | nameInput | <examName> |

    And Click in the new exam form
      | academicPeriod         |
      | <academicPeriodOption> |
      | gradeLevel             |
      | <gradeLevelOption>     |
      | documentType           |
      | <documentTypeOption>   |
      | examsAddBtn            |
      | saveButton             |

    And Click on the element in the left class
      | entranceExamsParent |
      | entranceExamsSetup  |
      | entranceExamsChild  |

    When User delete the "<examName>"
    Then Success message should be displayed
    Examples:
      | examName    | academicPeriodOption | gradeLevelOption | documentTypeOption |
      | Math exam00   | option2              | option4          | option4            |
      | IT exam00     | option1              | option1          | option1            |
      | Oracle exam00 | option2              | option2          | option2            |
      | Math exam00   | option1              | option3          | option3            |


