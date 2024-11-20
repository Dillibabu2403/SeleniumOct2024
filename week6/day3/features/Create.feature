Feature: Create functionality for leaftaps

Background:
Given enter username as 'democsr'
And enter the password as 'crmsfa'
And click on login button
And click on crmsfa link


Scenario Outline: To Verify user is able to create the lead successfully
Given click on leads link
And click on createlead link
And enter the company name as <companyname>
And enter the firstname <firstname>
And enter the last name <lastname>
When click on the create lead button
Then verify the lead is created
Examples:
|companyname|firstname|lastname|
|testleaf|dillibabu|r|
|Selenium|DB|R|

Scenario Outline: To Verify user is able to create the account successfully
Given click on accounts link
And click on createaccount link
And enter the account name as <accountname>
When click on the create account button
Then verify the account is created
Examples:
|accountname|
|Software QA|
|Automation Tester|