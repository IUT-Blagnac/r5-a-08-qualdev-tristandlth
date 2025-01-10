Feature: Cocktail Ordering
  As someone, I want to offer a drink to another person so that we can discuss together.

  Scenario: Creating an empty order
    Given "Romeo" who wants to buy a drink
    When an order is declared for "Juliette"
    Then there are 0 cocktails in the order