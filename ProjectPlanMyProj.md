# **Project Plan -- Team 57**

### 1 Introduction ###

The purpose of this project is to develop a tool which will help students to perfect their essay writing; particularly very long wordy and writing styles. This program will count the average number of words per sentence in a file.  

- **Software Development Process**
	- *Software Concept* : The SDLC (Software Development Life Cycle) of this project is Water Fall Model as per the requirement. 
    	- 	Assumption: Students are familiar with how to run Java program on their machine 
    	- 	Target Audiance : Students, Instructors to evaluate
    	- 	Scope : It is limited to the requirements outlined, and will have 2 deliverable. While it is nice to consider all possible real world scenarios but with limitation of resources the project will cover basic exception scenarios
    	- 	Resources : With the limited resources, this project will be managed by 4 Key players such as Project Manager, Document Lead, Development Lead and Testing Lead. It will be executed by using various colaboration tools from **google**, version control system - **gitHub**, IDE - **Eclipse**, software - **Java**, testing - **JUnit**. 

        
	- *Requirements Analysis* : The requirements document will contain all functional and non functional requirements for the application.  The requirements will be obtained by watching a requirements interview with the requester.  Additional questions will be sent as followup. 
    	- Assumptions

         	-This is a straight forward interpretation of the requirements and it's reasonable to assume that the sentences will be mostly correct.  
         	-It's assumed none of the users will attempt to be breaking the system by purposefully avoiding the use of all punctuation and spacing.
    
         	-Error conditions will be determined based upon the designer/developer's discretion as no specific error codes requirements were provided.

	- *Architectural Design* : This a simple command line program that accepts input, parses the input, and outputs information to the user.
        - Command line executable JAVA program
        - Program has one required argument
        - Program has a couple of optional arguments to adjust defaulted parameters
        - Program will output information to the user
	- *Detailed Design* : Below describes the a breakdown of the functional parts of the program.

        - Parse all program command line arguments
        - File object will read-in the defined file
        - File object data will be parsed by the defined sentence delimiters
        - Each delimited sentence will be assigned to the Sentence object
        - Sentence object will count all of the words that are greater than or equal to a defined minimum word length
        - After all of the file object data has been parsed, compute the average sentence length
        - If average sentence length is a decimal number, round it down to the nearest whole number
        - Output the average sentence length or a message to the user for an exception that occurred

	- *Coding and Debugging*
    	- The software will be written in JAVA
        - Eclipse IDE will be used to code and debug the developed software
        - No external JAVA plug-ins, extensions, or libraries will be needed for the development or to execute the developed software
        - Junit tests will be created for compliance/regression testing to guarantee stable functionality of the developed software and that later modifications do not cause unhandled exceptions to occur

	- *System Testing* : The system testing will include test cases for counting the average number of words with varying types of delimiters and varying word lengths. Test cases will be created for exception handling as well. An example of some exceptions might include instances where a file might not have any delimiters or the file size is too large to process. The system should have some method of gracefully handling these type of situations.

### 2 Process Description ###

The requirements gathering process will obtain requirements from the online video.  The document lead will determine if any additional information is required and if so, ask up to two questions via a document submission to the instructor.  The entrance criteria for this phase is starting the project.  The exit criteria will be the creation of the requirements document with agreement by all team members.

Team meetings will take place with all team members to insure each deliverable is reviewed and understood by all.  The meetings will take place when the exit criteria or entrance criteria is met for a dependent deliverable.

Design creation is the process of mapping out the requirements into a design document to insure the software will meet all functional and non-functional requirements.  The entrance criteria is the finalization and peer review of the requirements document template.  The exit criteria is the creation of the design document.

Development phase will cover the code development and unit testing of the code to insure the application functions for the tester.  The entrance criteria is the draft completion of the design document.  The exit criteria is testable code.

Testing will start with the creation of the test cases off of the functional and non-functional requirements and demonstrate that the test data covers the appropriate requirements.  The testing will produce an output on the number of test cases run and the test cases passed.  The entrance criteria is testable code and the exit criteria is an updated design document, owned by the designer, finalized requirements document, owned by the requirements writer, finalized and packaged code, owned by the developer and the final test results, owned by the tester.

Project Completion is the phase of the project where the results are submitted to the client/instructor.  The entrance criteria is the completion of the testing phase and the exit criteria is the submission of the log ID into T-Square.  


### **3 Team** ###
- **Team members' names**
	- Susanta Kumar Routray
	- Robin Frank
	- Mark Halamik
	- Craig Groves
- **Roles, with a short description of each role**
	- *Project Manager (PM)*
    	- Lead and coordinate the team activities tasks including code review
    	- Define, Schedule and Submit the Project Plan
    	- Track team's progress on regular basis
    	- Final submission to gitHub at Major milestone
    	- Facilitate the resolution of any conflict that may arise
	- *Document Lead (Doc Lead)*
    	- Define Software Requirement in details 
    	- Review the requirements with stake holders 
    	- Peer review 
    	- Review design document and the test plan and insure changes to requirements are traced to the design document and test plans. 
    	- Coordinate & track defects 
	- *Development Lead (Dev Lead)*
    	- Design, Architect and Develop the code
    	- Make sure that it is in sync with the requirement
    	- Work closely with QA Lead and Document lead during testing phase
    	- Follow the schedule
    	- Reach out to PM if you can't meet the deadlines before hand
	- *Quality Assurance Lead (QA Lead)*
    	- Prepare test plan and cases once the requirement is finalized and approved
    	- Consider test cases having edge conditions in mind
    	- Make sure that the code has not only covered all possible scenarios defined in requirement but also covered all possible exceptions scenarios 
    	- Provide the summary of test cases to the team
- **Table showing which team member(s) has which role(s)**

    <table>
    <tbody>
	<tr>
		<td><b>Team Member</b></td>
		<td><b>Role</b></td>
	</tr>
	<tr>
		<td>Susanta Routray</td>
		<td>Project Manager</td>
	</tr>
	<tr>
		<td>Mark Halamik</td>
		<td>Development Lead</td>
	</tr>
	<tr>
		<td>Craig Groves</td>
		<td>Quality Assurance Lead</td>
	</tr>
	<tr>
		<td>Robin Frank</td>
		<td>Documentation Lead</td>
	</tr>
    </tbody>
    </table>

### **4 Estimates** ###

Estimates for the following metrics:

- **Effort hours**: total number of team-member hours expected to spend on the project

    <table>
    <tbody>
	<tr>
		<td><b>Tasks</b></td>
		<td><b>No of Hours</b></td>
	</tr>
	<tr>
		<td>Project Management</td>
		<td>12</td>
	</tr>
	<tr>
		<td>Development</td>
		<td>14</td>
	</tr>
	<tr>
		<td>Testing</td>
		<td>12</td>
	</tr>
	<tr>
		<td>Documentation</td>
		<td>12</td>
	</tr>
	<tr>
		<td><b>Total</b></td>
		<td><b>50</b></td>
    </tbody>
    </table>

- **Lines of code**: total number of lines of source code expected to have in the final product

    <table>
    <tbody>
	<tr>
		<td><b>Coding Area</b></td>
		<td><b>Lines Of Codes</b></td>
	</tr>
	<tr>
		<td>Main Development</td>
		<td>200</td>
	</tr>
	<tr>
		<td>Test</td>
		<td>150</td>
	</tr>
	<tr>
		<td><b>Total</b></td>
		<td><b>350</b></td>
    </tbody>
    </table>


