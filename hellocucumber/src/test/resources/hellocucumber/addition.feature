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

Feature: Calculator addition
	testing the calculator addition
      
	Scenario Outline: Add two numbers
		Given A first number <numbera>
		And A second number <numberb>
		When I press sum
		Then the result should be <answer> on screen
				
		Examples:
		
		| numbera | numberb | answer   |
		| 20.5    | 40		  |	60.5     |
		| 10.5		| 0				|	10.5		 |
		| -2			| 4.5			|	2.5			 |
		| 0   	  | -4.5		|	-4.5		 |
		
	Scenario: Add infinite numbers
		When I add two infinite numbers
		Then test should thrown an ArithmeticException

		
#	Scenario: Add infinite numbers
#		Given A first number <numbera> 
#		And A second number <numberb>
#		When I press sum
#		And one of them is infinite
#		Then a exception will be thrown
#		
#		Examples:
#		
#		| numbera | numberb | answer |
#		| 		 		| 40		  |	60		 |
#		| 10		  | 0				|	10		 |
#		| 2			  | 4				|	6			 |
#		| 0   	  | 4				|	4			 |
	
	