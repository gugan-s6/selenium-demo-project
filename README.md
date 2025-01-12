### Selenium-demo-project
Demo project to interact and test web elements and generating test reports using testNG.
This project demonstrates a suite of Selenium tests implemented using Java and TestNG. It is intended as a showcase for automation testing skills. 

## Features 
Automated test cases for interacting with web elements: 
- Hyperlink testing 
- Textbox interaction 
- Button clicks 
- Alert handling 
- Dropdown selection 
- Radio buttons and checkboxes 
- Drag-and-drop operations 
- Utilizes TestNG for test management. 
- Includes Maven for dependency management.

## Prerequisites
Ensure the following software is installed:
1. Java Development Kit (JDK) (version 8 or later)
2. Maven (build automation tool)
3. ChromeDriver, GeckoDriver, or other WebDriver binaries matching your browser versions.
4. A supported browser such as Chrome, Firefox, or Edge.

## Setup and Execution
1. Clone the repository:
   ```bash
      git clone https://github.com/gugan-s6/selenium-demo-project.git  
      cd selenium-demo-project

2. Install dependencies:
   ```bash
      mvn clean install

4. Run the tests:
   Execute all tests using the TestNG XML file:
      ```bash
         mvn test

5. Generate Test Reports:
   TestNG will generate default test reports in the test-output folder.
   Open test-output/index.html in a browser to view the results.

## File Structure
- ```src/test/java```: Contains the test classes.
   - ```DemoTest1.java```: Core Selenium test class demonstrating interactions with web elements.
   - ```ParentClass.java```: Base class for setting up WebDriver, common configurations, and utilities.
- ```pom.xml```: Maven configuration file for managing dependencies.
- ```testNG.xml```: TestNG configuration file for organizing and running test suites.
- ```README.md```: Documentation for the project.
