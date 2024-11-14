Feature: login functionality for leaftaps

Background:
Given enter username as 'demosalesmanager'
And enter the password as 'crmsfa'
And click on login button
And click on crmsfa link
And click on leads link


Scenario Outline: To Verify user is able to create the lead successfully
Given click on createlink lead
And enter the company name as <companyname>
And enter the firstname <firstname>
And enter the last name <lastname>
When click on the create lead button
Then verify the lead is created
Examples:
|companyname|firstname|lastname|
|testleaf|dillibabu|r|
|cognizant|DB|R|


Scenario Outline: To Verify user is able to edit the lead successfully
Given Click on Find leads link
And Click on Phone tab
And Enter phone number as <phNo>
And Click on Find Leads button
And Select the lead from the list
And Click on edit option
And Update the company name as <cname>
When Click on Update button
Then Verify the details are updated
Examples:
|phNo|cname|
|1234|FTP|
|123|DB|


Scenario: To Verify user is able to delete the lead successfully
Given Click on Find leads link
And Click on Phone tab
And Enter phone number as '1234'
And Click on Find Leads button
And Select the lead from the list
When Click on delete option
Then Verify the lead is deleted
