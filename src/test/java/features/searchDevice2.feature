#
#Feature: Application login
#
#@RegressionTest
#Scenario: Postpaid login
#
#Given User is on STC landing page
#When User login into application with "50012053" and password "50012053@"
#Then User is on selfcare dashboard page
#And User name is displayed
#
#@SmokeTest @RegressionTest
#Scenario Outline: Prepaid login
#
#Given User is on STC landing page
#When User login into application with "<Username>" and password "<Password>"
#Then User is on selfcare dashboard page
#And User name is displayed
#
#Examples:
#	 | Username  | Password    |
#	 | 50012053 | 50012053@ |
   #| 50010470  | 50010470@ |
   #
  #@SmokeTest
  #Scenario: User page SignUp 
#
#Given User is on STC landing page
#When User SignUp into application
#| firstName |
#| Lastname |
#| test@mail.com |
#| 50012053 |
#Then User is on selfcare dashboard page
#And User name is displayed