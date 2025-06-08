Feature: Check the number! Can it be divided by 3, 5 or not?

  Scenario Outline: The number can be divided by 3, 5 or not
    Given the given number <number>
    When fizzBizz method is started with the number
    Then i should expect <expect>
    Examples:
    | number | expect |
    | 3 | "Fizz" |
    | 5 | "Buzz" |
    | 6 | "Fizz" |
    | 10 | "Buzz" |
    | 15 | "FizzBuzz" |
    | 30 | "FizzBuzz" |
    | 2 | "None" |
    | 1 | "None" |