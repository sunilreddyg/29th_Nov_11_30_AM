Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username   | password |
    | testuser_8 | Test@111 |
    | testuser_9 | Test@222 |
    | testuser_10 | Test@333 |