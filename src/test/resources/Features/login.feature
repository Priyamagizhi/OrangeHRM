Feature: To validate the login functionality of orange application
Background:
 Given The user should be in orange homepage and has to fill "Admin" and "admin123" and click the login buttons
 
Scenario: To validate the login functionality with valid credentials
When The user click recruitment page
When The user click add button
When The user has to fill fullname "LakshmiPriya"
And The user has to fill lastname "Jaisankar"
When The user has to choose the vacancy buttons
When The user has to fill email id "priya9876@gmail.com"
When The user has to fill contact number "987654321"
And The user has to scrolldown
When The user has to click the "save" button




Scenario: To validate the create claim request
When The user has to be in the claim module and able to click the Assign claim
Then The user has to fill the employee name , event and currency and click the create button
And The user has to add their expenses type and amount "50000"  and click submit
Then The user can view the claims in the Employee claims

















