
public class Checklist {

	/*
											User Story #1
											Create a JetsApplication with a main method to launch your program.

											User Story #2
											Jets are found at an AirField. Create the AirField class, which has an array of Jets.

											On program startup, populate the AirField with at least 5 Jets of different types.
											The array must have extra space for adding Jets.
	
											User Story #3
											There is a menu with these options:
									
											List fleet
											Fly all jets
											View fastest jet
											View jet with longest range
											Load all Cargo Jets
											Dogfight!
											Add a jet to Fleet
											Quit
		
											User Story #4
											List fleet prints out the model, speed, range, and price of each jet. (There must be at least 5 jets stored when the program starts).

											User Story #5
											Fly all Jets calls the fly() method on the entire fleet of jets.

											User Story #6
											The view fastest jet and longest range options both print out all of the information about a jet.
											Note: these methods must search the collection of jets to find the appropriate jet.
		
											User Story #7
											The user is presented with an option specific to the interfaces you created. For example, Load all Cargo Jets finds all implementors of the CargoCarrier interface and calls loadCargo() on each. (Note that the menu text is italicized because yours may be different.)

											User Story #8
											A user can add custom jets to the fleet.


											User Story #9
											Quit exits the program.

	
	
	
	
	
	
	Stretch Goals
	Try implementing these stories only when you have committed and pushed a working project.
	
	This can be a JetImpl.
	Stretch Goal: This leads to a sub-menu where the user chooses the type of Jet.
	Users then enter information for the Jet, and it is added to the AirField.

	User Story #10
	Users see a menu item to fly an individual Jet, and then choose the Jet in a sub-menu.

	User Story #11
	Each jet has a pilot.

	User Story #12
	Assign a random pilot to each jet that is created.

	User Story #13
	Users can hire pilots.

	User Story #14
	Whenever a jet's information is displayed, that jet's pilot and his/her information should also be displayed.
	
	
	

	Grading
	This is a graded project. You are expected to have your project completed by the start of class next week.

	You will be given either a pass or fail based on whether your code works given all of the following test conditions:

		When menu option 1 is pressed all Jets in the fleet are displayed to the user.
		When menu option 2 is selected, fly() is executed on all Jets.
		When menu option 3 is selected, the fastest jet from the list of Jets should be displayed to the user.
		When menu option 4 is selected, the jet with the longest range should be displayed to the user.
		Choosing type-specific behavior calls the interface method for those Jets.
	When the user chooses to add a Jet, you are prompted to enter the model, speed (in MPH), range, and price. This Jet should be added to the list of Jets so that when the user again selects menu option 1, that custom jet is included.
		If you implement the option to choose Jet type, this menu displays before entering Jet data.
		The final menu option should exit the program.
	
	
	
	
	If the project does work with all of the above test conditions, you will be given a 1 for this week's project.

	If the project does not work with the above test conditions, you will be given a 0 for this week's project.

	If you get a zero on the project, you can upgrade to a score of .5 if you turn in a working project by the start of class on the following week AND notify an instructor that you wish to get partial credit.

	To turn in a project, you must push it to GitHub. You must include a README.md that describes how to run your program.
	*/
}
