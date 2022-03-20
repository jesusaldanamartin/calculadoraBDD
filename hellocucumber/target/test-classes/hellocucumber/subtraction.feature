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

Feature: Calculator subtraction
	testing the calculator subtraction
      
	Scenario Outline: Subtract two numbers
		Given A first number <resta1> 
		And A second number <resta2>
		When I press minus
		Then the result should be <answer> on screen
		
		Examples:
		
		| resta1  | resta2  | answer |
		| 10		  | 0				|	10		 |
		| 20			| 4.5			|	15.5	 |
		| 20.5   	| -4			|	24.5 	 |
		| 20.5   	| 10.5		|	10 		 |

			Scenario: Subtract infinite numbers
		When I subtract two infinite numbers
		Then test should thrown an ArithmeticException
		