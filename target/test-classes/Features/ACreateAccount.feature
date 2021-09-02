 @test
Feature: Register on the given website 
         validate registered user



  Scenario: New user registration       
    Given user is on Application landing page
    And   click on sign in 
    When user enters emailid in email Id field
    And  user clicks on create account
    Then enter your details and create account
    And validate the landing screen with  name and surname 