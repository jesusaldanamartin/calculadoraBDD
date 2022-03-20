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

Feature: Calculator product
	testing the calculator product
      
	Scenario Outline: Product of two numbers
		Given A first number <product1> 
		And A second number <product2>
		When I press product
		Then the result should be <answer> on screen
		
		Examples:
		
		| product1  | product2  | answer |
		| 10		    | 0				  |	0	  	 |
		| 20			  | 5 			  |	100 	 |
		| 0   	    | 120			  |	0   	 |
		| 100   	  | 100 	    |	10000  |

			Scenario: Product of infinite numbers
		When I multiply two infinite numbers
		Then test should thrown an ArithmeticException


