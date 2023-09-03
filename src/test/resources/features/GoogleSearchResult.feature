@akirolabs
Feature: Google Search Functionality
  Agile Story: As a user, when I insert one item into the google search button,I should see the results after submitting

  1-Verify that user is on the Google main page
  2-Verify that user  can see the results
  3-Verify that user ensures the first result page is opened
  4-Verify that opened page contains initial search phrase


  Scenario: User should insert one item into the google search button and checked the first matched one
    When user on the google main page
    And user clicks the google search field
    And user enters one "item" into the search field
    And user clicks the google search button
    And user should see the results on the result page
    And user clicks the first result
    Then user should be on the first clicked  page





