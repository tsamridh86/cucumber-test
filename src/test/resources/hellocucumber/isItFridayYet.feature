Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  @RegularTest
  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  @RegularTest @GreatTest
  Scenario: It is Friday
    Given today is Friday
    When I ask whether it's Friday yet
    Then I should be told "Yes"

  @FailureTest
  Scenario: I was spoken random stuff
    Given today is whatever
    When I ask whether it's Friday yet
    Then I should be told "Nope"