Feature: Cash Withdrawal
  Scenario Outline: Correct money withdraw
    Given I have money in my wallet in amount <amount>
    When I withdraw <money>
    Then cashier should give me <money>
    And I should have money left <rest>
    Examples:
    | amount | money | rest |
    | 200 | 30 | 170 |
    | 100 | 50 | 50 |
    | 50 | 10 | 40 |
    | 50 | 50 | 0 |
