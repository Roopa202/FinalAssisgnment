@test
Feature: Validate the registered user


  Scenario: Logut and login again
     Given user is on Homepage
     When login with registered email id
     And  click on logout
     Then validate the registered user