Feature: This feature contains set of test cases to search in google
@Smoke
Scenario Outline: verify serch result of "Selenium Java interview questions"
Given user is already on google search page
When user enters <textToBeSearched> into search input field 
And press enter button
Then user should be able to see search result page with page title having <textToBeSearched>

Examples:
|textToBeSearched|
|Selenium Java interview questions|
|API interview questions|
|Manual Testing interview questions|