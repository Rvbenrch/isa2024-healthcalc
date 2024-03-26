Feature: Calculate Basal Metabolic Rate

As a user of the health calculator
I want to calculate the basal metabolic rate according to the parameters entered
So that I can know the resulting of this health measurement

@tag1
Scenario Outline: Invalid Height
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid height <height>
    Then the system raises an exception

    Examples:
      | height |
      |-40     |
      |-18     |
      | 0      |

@tag2
Scenario Outline: Invalid Weight
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid gender <gender>
    Then the system raises an exception

    Examples:
      | gender |
      | 'h'    |
      | '.'    |
      | '9'    |

@tag3
Scenario Outline: Invalid Age
    Given I have an health calculator
    When I compute the basal metabolic rate for a negative age <age>
    Then the system raises an exception

    Examples:
      | age  |
      |-87   |
      |-4    |
      |-1    |

@tag4
Scenario Outline: Invalid Weight
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid weight <weight>
    Then the system raises an exception

    Examples:
      | weight |
      |-8      |
      |-57     |
      | 0      |

@tag5
Scenario Outline: Negative Result for Weight (only possible for women)
    Given I have an health calculator
    When I compute the basal metabolic rate of gender 'w' with a combination of height <height>, weight <weight>, and age <age> whose result is a negative weight
    Then the system raises an exception

    Examples:
      | height | weight | age |
      | 2      | 10     | 25  |
      | 10     | 10     | 1   |
      | 34     | 2      | 34  |

@tag6
Scenario Outline: Given valid parameters
    Given I have an health calculator
    When I compute the basal metabolic rate for the given valid parameters <weight>, <height>, <gender>, <age>
    Then the system returns a valid result <result>

    Examples:
      | height | weight | age | gender | result    |
      | 160    | 50     | 25  | 'w'    | '1214'    |
      | 189    | 72     | 45  | 'w'    | '1515.25' |
      | 210    | 90     | 34  | 'm'    | '2047.5'  |
      | 134    | 46     | 9   | 'm'    | '1257.5'  |
Feature: Calculate Basal Metabolic Rate

As a user of the health calculator
I want to calculate the basal metabolic rate according to the parameters entered
So that I can know the resulting of this health measurement

@tag1
Scenario Outline: Invalid Height
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid height <height>
    Then the system raises an exception

    Examples:
      | height |
      |-40     |
      |-18     |
      | 0      |

@tag2
Scenario Outline: Invalid Weight
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid gender <gender>
    Then the system raises an exception

    Examples:
      | gender |
      | 'h'    |
      | '.'    |
      | '9'    |

@tag3
Scenario Outline: Invalid Age
    Given I have an health calculator
    When I compute the basal metabolic rate for a negative age <age>
    Then the system raises an exception

    Examples:
      | age  |
      |-87   |
      |-4    |
      |-1    |

@tag4
Scenario Outline: Invalid Weight
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid weight <weight>
    Then the system raises an exception

    Examples:
      | weight |
      |-8      |
      |-57     |
      | 0      |

@tag5
Scenario Outline: Negative Result for Weight (only possible for women)
    Given I have an health calculator
    When I compute the basal metabolic rate of gender 'w' with a combination of height <height>, weight <weight>, and age <age> whose result is a negative weight
    Then the system raises an exception

    Examples:
      | height | weight | age |
      | 2      | 10     | 25  |
      | 10     | 10     | 1   |
      | 34     | 2      | 34  |

@tag6
Scenario Outline: Given valid parameters
    Given I have an health calculator
    When I compute the basal metabolic rate for the given valid parameters <weight>, <height>, <gender>, <age>
    Then the system returns a valid result <result>

    Examples:
      | height | weight | age | gender | result    |
      | 160    | 50     | 25  | 'w'    | '1214'    |
      | 189    | 72     | 45  | 'w'    | '1515.25' |
      | 210    | 90     | 34  | 'm'    | '2047.5'  |
      | 134    | 46     | 9   | 'm'    | '1257.5'  |
Feature: Calculate Basal Metabolic Rate

As a user of the health calculator
I want to calculate the basal metabolic rate according to the parameters entered
So that I can know the resulting of this health measurement

@tag1
Scenario Outline: Invalid Height
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid height <height>
    Then the system raises an exception

    Examples:
      | height |
      |-40     |
      |-18     |
      | 0      |

@tag2
Scenario Outline: Invalid Weight
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid gender <gender>
    Then the system raises an exception

    Examples:
      | gender |
      | 'h'    |
      | '.'    |
      | '9'    |

@tag3
Scenario Outline: Invalid Age
    Given I have an health calculator
    When I compute the basal metabolic rate for a negative age <age>
    Then the system raises an exception

    Examples:
      | age  |
      |-87   |
      |-4    |
      |-1    |

@tag4
Scenario Outline: Invalid Weight
    Given I have an health calculator
    When I compute the basal metabolic rate for an invalid weight <weight>
    Then the system raises an exception

    Examples:
      | weight |
      |-8      |
      |-57     |
      | 0      |

@tag5
Scenario Outline: Negative Result for Weight (only possible for women)
    Given I have an health calculator
    When I compute the basal metabolic rate of gender 'w' with a combination of height <height>, weight <weight>, and age <age> whose result is a negative weight
    Then the system raises an exception

    Examples:
      | height | weight | age |
      | 2      | 10     | 25  |
      | 10     | 10     | 1   |
      | 34     | 2      | 34  |

@tag6
Scenario Outline: Given valid parameters
    Given I have an health calculator
    When I compute the basal metabolic rate for the given valid parameters <weight>, <height>, <gender>, <age>
    Then the system returns a valid result <result>

    Examples:
      | height | weight | age | gender | result    |
      | 160    | 50     | 25  | 'w'    | '1214'    |
      | 189    | 72     | 45  | 'w'    | '1515.25' |
      | 210    | 90     | 34  | 'm'    | '2047.5'  |
      | 134    | 46     | 9   | 'm'    | '1257.5'  |
