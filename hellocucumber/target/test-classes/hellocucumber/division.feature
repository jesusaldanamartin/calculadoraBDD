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

Feature: Calculator division
	testing the calculator division
      
	Scenario Outline: Two numbers divided
		Given A first number <division1> 
		And A second number <division2>
		When I press division
		Then the result should be <answer> on screen
		
		Examples:
		
		| division1  | division2  | answer |
		| 10		     | 2				  |	5	  	 |
		| 2000		   | 100		    |	20  	 |
		| 0   	     | 2	  		  |	0   	 |
		

			Scenario: Number divided by zero 
		When I divide a number by zero
		Then test should thrown an ArithmeticException
	