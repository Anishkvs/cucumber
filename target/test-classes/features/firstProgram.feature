
Feature: Application Login

Background: 
Given setup the entries in database
When launch the browser from config variables
And Hit the homepage URl of banking site

@Smoke
Scenario Outline: Admin page default login

Given User is on the Netbanking  landing page
When User login into the application with "<userName>" and "<password>"
Then Home page is displayed
And Cards are displayed

@RegressionTest @Smoke 
Scenario: Regular Expression, Admin page default login

Given User is on the Netbanking  landing page
When Regular User login into the application with userName and password 
Then Home page is displayed
And Cards are displayed

Examples:
| userName | password |
| test              | 1234 |
| test2            | 1234545 |

@MobileTest 
Scenario: User page default sign Up

Given User is on pratice landing page
When User 	SignUp into application
| anish |
|Kumar |
|test@gmail.com |
| 9843000000 |
Then HomePage is displayed1
And Cards are displayed