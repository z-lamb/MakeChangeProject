## Make Change Project

### Week One homework for Skill Distillery

#### Summary:
This program takes the input from the user for how much their purchase price is and how much they are tendering to pay for the purchase. If the purchase is equal to the amount being tendered the program will display a message and close. If the amount being tendered is less than what is needed the user will have the chance to give more until enough has been given for the purchase price. If the user is not willing to be enter enough for the purchase a message will be given and the program will exit. If at any point the user gives more than the required amount the program will display the total amount of change being given and exit.

#### Operation:
Enter amounts in standard USD format.
Enter response to questions in either "Y" for Yes or "N" for No.

#### Processes:
Not all of these were required or would make the program more efficient  but were added to practice using them
- Methods
- Array
- Scanner
- Printing
- While Loop
- If Statement
- Switch
- Double
- Int
- Mathematical Operators
- Relational Operators
- Concatenation

#### Overview:
- From the main method call requests method
	- From the requests method
		- Create an array to hold the two values of amount required and amount being tendered
		- Request amount required as a double, convert to int and store in array[0] as total amount in pennies
		- Request amount being tendered as a double, convert to int and store in array[1] as total amount in pennies
			- Loop if amount tendered is equal to or less than amount required
				- If amount being tendered is equal to amount required print out message and close program
				- Else amount being tendered is less than amount required and ask if they would like more
					- Use switch to accommodate different ways Yes and No can be entered
						- If Yes is entered ask for how much more will be given and add it to array[1]
						- If No is entered print out message and close the program
						- If anything else is entered it will print a message giving instructions
				- If at any point the amount being tendered is more than the amount required call changeMaker method and send array
		- Declare String that will return the string of changeMaker() method
	- Call changeMaker() method and pass through array
		- Declare ints needed to calculate
		- Take amounts from the array and calculate amount of change needed
		- Print amount tendered, amount required, and change as converted to doubles and printed to USD format
		- Use if statements to determine what denomination is needed for change
			- Use if/else statements if more than 1 of a denomination can be given back to have proper plurality
		- Return string back to requests method
	- Print final message
- Close Program
  