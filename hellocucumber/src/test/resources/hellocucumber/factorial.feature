#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Calculator factorial
	testing the calculator factorial
      
	Scenario: Factorial number
		Given A integer number <factorial1> 
		When I press factorial
		Then the result should be <answer> on screen
		
		Examples:
		
		| factorial1 | answer |
		| 0 		     | 	1 	  |
		| 1   		   |  1			|
		| 5   	     | 120		|
		

	Scenario: Factorial of huge numbers 
		When I try to test the factorial for a number > sixteen
		Then test should thrown an ArithmeticException