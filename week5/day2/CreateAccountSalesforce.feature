Feature: Create new Account in Salesforce application
Scenario: Verify that the account is created successfully with valid credentials
Given User navigates to the salesforce website
And enter the username as vidyar@testleaf.com
And enter the password as Sales@123
And Click on Login button
And Click on toggle menu button from the left corner
And Click view All and click Sales from App Launcher
And Click on Accounts tab 
And Click on New button
And Enter your name as account name
And Select Ownership as Public 
When Click on save button
Then Account should be created successfully



