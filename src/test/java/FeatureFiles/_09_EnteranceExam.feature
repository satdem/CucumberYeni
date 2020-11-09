Feature: Entrance Exam functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  @RegressionTest
  Scenario: Create entrance exam

    And Click on the element in the left class
      | entranceExamsParent |
      | entranceExamsSetup  |
      | entranceExamsChild  |

    And Click in the new exam form
      | addButton |

    When User sending the keys in the form content class
      | nameInput | rr67|

    And Click in the new exam form
      | academicPeriod |
      | option1        |
      | gradeLevel     |
      | option1        |
      | documentType   |
      | option1        |
      | examsAddBtn    |
      | saveButton     |

    And Click on the element in the left class
      | entranceExamsParent |
      | entranceExamsSetup  |
      | entranceExamsChild  |

    When User delete the "rr67"
    Then Success message should be displayed

