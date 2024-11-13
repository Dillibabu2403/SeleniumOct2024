Feature: Edit Account in Salesforce application
Background:
Given User navigates to the salesforce website
And enter the username for salesforce as 'vidyar@testleaf.com'
And enter the password for salesforce as 'Sales@123'
And Click on salesforce Login button

Scenario: Verify that the user is able to update the Account details using Static Parameterization
When Click on toggle menu button from the left corner
And Click view All and click Sales from App Launcher
And Click on Accounts tab
And Search for the account using your unique account name
And Click the dropdown icon next to the account and select Edit
And Set Type to Technology Partner
And Set Industry to Healthcare
And Enter the Billing Address as 'ABC street,xyz'
And Enter the Shipping Address as 'fff street,abc'
And Set Customer Priority to Low
And Set SLA to Silver
And Set Active to NO
And Enter a unique number in the Phone field as '1122334455'
And Set Upsell Opportunity to No
When Click Save
Then verify the phone number

Scenario Outline: Verify that the user is able to create the Account details using Dynamic Parameterization
When Click on toggle menu button from the left corner
And Click view All and click Sales from App Launcher
And Click on Accounts tab
And Click on New button
And Enter your name as <accountname>
And Select Ownership as Public 
When Click on save button
Then verify the Account should be created successfully

Examples:
|accountname|
|BabuDB|
|TestCucumber|


