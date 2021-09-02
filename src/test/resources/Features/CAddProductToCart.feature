@test
Feature: Add a product to cart and checkout 
         validate the product details


 Scenario: Add product to cart and checkout
     Given User is on the Homepage 
     And  Login with valid credentials
     Then Add a product to cart
     And  Proceed to checkout 
     Then Validate the product details