Feature: Calculate Ideal Weight

  "As a user,
  I want to calculate the ideal weight according to the parameters entered
  So that I can determine the resulting ideal weight."

  @invalid_height
  Scenario Outline: Invalid Height
    Given I have a health calculator
    When I compute the ideal weight for a negative height <h>
    Then the system should raise an exception
   
    Examples:
      | h  |
      | -10|
      | -5 |
      |  0 |

  @invalid_gender
  Scenario Outline: Invalid Gender
    Given I have a health calculator
    When I compute the ideal weight for an invalid gender <g>
    Then the system should raise an exception
   
    Examples:
      | g   |
      | 'n' |
      | 'y' |
      | '4' |

  @negative_weight_result
  Scenario Outline: Negative Weight Result
    Given I have a health calculator
    When I compute the ideal weight for gender <g> and height <h> and it results in a negative value
    Then the system should raise an exception
   
    Examples:
      | g   | h  |
      | 'm' | 83 |
      | 'm' | 40 |
      | 'w' | 66 |
      | 'w' | 30 |

  @feasible_result
  Scenario Outline: Valid Parameter Feasible Result
    Given I have a health calculator
    When I compute the ideal weight for gender <g> and height <h>
    Then the system should return a feasible result <value>
   
    Examples:
      | g   | h   | value |
      | 'w' | 160 | '56'  |
      | 'w' | 156 | '53.6'|
      | 'm' | 180 | '72.5'|
      | 'm' | 174 | '68'  |
