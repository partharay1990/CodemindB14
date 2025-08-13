#Author: Codemind
#This feature is related to login functionality
Feature: Login Functionality

Background:

#Given launch Application 

@tag
Scenario Outline: Verify valid login

Given launch Application 
When enter valid uname <username>
And  enter valid pass <password> 
And  click on submit button
Then verify user logged in successfully

Examples:

|username|password|
|admin|admin@123|
|user|user@123|


@tag1
Scenario: Verify invalid login

Given launch Application
 
When enter invalid username and password

|uname|password|
|u1|u@123|

And click on submit button

Then verify user not logged in successfully

And close browser


