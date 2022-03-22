Feature: Etsy Title Verfication

  Background: user is on the login page
    Given User is on Etsy the homepage


  Scenario: Etsy Title Verification
  //Given User is on Etsy the homepage
    Then User sees title is as expected


  Scenario: Etsy Search Functionality Title Verification
    //Given User is on Etsy the homepage
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title



  Scenario: Etsy Search Functionality Title Verification
   //Given User is on Etsy the homepage
    When User types "Wooden spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon" is in the title