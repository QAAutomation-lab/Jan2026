Feature: This feature contains set of test cases to search in google

Scenario: verify serch result of "Selenium Java interview questions"
Given user is already on google search page
When user enters "Selenium Java interview questions" into search input field 
And press enter button
Then user should be able to see search result page with page title having "Selenium Java interview questions"


Scenario: verify serch result of "API interview questions"
Given user is already on google search page
When user enters "API interview questions" into search input field 
And press enter button
Then user should be able to see search result page with page title having "API interview questions"


Scenario: verify serch result of "Manual testing interview questions"
Given user is already on google search page
When user enters "Manual testing interview questions" into search input field 
And press enter button
Then user should be able to see search result page with page title having "Manual testing interview questions"