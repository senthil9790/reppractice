
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: To Search the product in Flipkart page
    Given user is in Flipkart page
    When user search the  <product> in flipkart
    Then user added the product in cart

    Examples: 
      | product  |
      | iphone 5s |
      | samsung s7 |
      | iphone 6s |
      | samsung s8 |
      | iphone x |
