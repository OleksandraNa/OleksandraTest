Narrative:
As a user
I want to make an operation
So that I can get results of two numbers

Scenario: scenario addition of two numbers
Given user opens calculator page
And user gets empty entry field
When user selects the first number as <number1>
And user selects the operation sign as <sign>
And user selects the second number as <number2>
And user selects the equal sign
Then user gets the result as <result>
And user closes calculator page

Examples:
|sign|number1|number2|result|
|+|1|2|3|
|+|10|300|310|

Scenario: scenario division of two numbers
Given user opens calculator page
And user gets empty entry field
When user selects the first number as <number1>
And user selects the operation sign as <sign>
And user selects the second number as <number2>
And user selects the equal sign
Then user gets the result as <result>
And user closes calculator page

Examples:
|sign|number1|number2|result|
|-|10|2|8|
|-|120|20|100|

Scenario: scenario multiplication of two numbers
Given user opens calculator page
And user gets empty entry field
When user selects the first number as <number1>
And user selects the operation sign as <sign>
And user selects the second number as <number2>
And user selects the equal sign
Then user gets the result as <result>
And user closes calculator page

Examples:
|sign|number1|number2|result|
|*|10|2|20|
|*|0|20|0|

Scenario: scenario division of two numbers
Given user opens calculator page
And user gets empty entry field
When user selects the first number as <number1>
And user selects the operation sign as <sign>
And user selects the second number as <number2>
And user selects the equal sign
Then user gets the result as <result>
And user closes calculator page

Examples:
|sign|number1|number2|result|
|/|16|8|2|
|/|100|0|Infinity|