
Feature: Application Login

@RegressionTest
Scenario Outline: Admin page default login

Given User is on the Netbanking  landing page
When User login into the application with "<userName>" and "<password>"
Then Home page is displayed
And Cards are displayed

@RegressionTest
Scenario: Regular Expression, Admin page default login

Given User is on the Netbanking  landing page
When Regular User login into the application with userName and password 
Then Home page is displayed
And Cards are displayed

Examples:
| userName | password |
| test              | 1234 |
| test2            | 1234545 |