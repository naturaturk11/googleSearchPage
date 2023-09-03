# googleSearchPage
------------As a framework used in the project:-------------
Java Selenium Cucumber project inside a Google search action was tested.
In this project Java as a programing language,
Selenium as a automation tool and Maven built automation tool were used.
Cucumber with BDD framework by using gherkin language was used the steps to be understood easily.
As part of project Junit and TestNG were used to manage the project and assertions were  used for verifications.
Features package under the Resources Directory was created for the Scenario with the steps  of the testing process.
POMxml are the storage for the dependencies ang necessary plugins.Each needed version of dependicies were added.
Configuration.properties is a Directory in which some key=value format basic information were added 
  ...to control project easily and avoid from hard coding but insted making some common info easily
Page Object Model is main concept of the project. Th pages package was created to locate the web elements and 
...it provides to make any changes when neccesary and the located elements used in the coding process easily
...and two type of pages were created to be followed the coding process clearly
Intelij-IDE was used to write the project.
To run codes, two types of runner class were created one of them is used to run the codes 
...the FailedTestRunner was created to test the failed codes only.
Inside the Cukes Runner the paths of feature and stepDefinition were added 
...and plugin for the comprehensive reporting was integrated.tags is used for the signof executed part
Inside step definition part two class were created one of them consists of codes and assertions
...the other class,hook, was created to get a screenshot when any failure is revealed.
In the utilities part, Driver as a singelton design pattern for execution the codes was created.
Configuration reader was the created to read the information located inside configuration.properties.
Some commonly used methods which makes the coding and testing process so fast and safe were located 
....inside BrowserUtils
For the reporting part the cucumber reporting plugin were added to be uderstood the results properly and
...detailed analysis could be reached by using cucumber report.

------Testing and Assertion process----------
 The google main page was analyzied in order to ensure the search button works adequately. This testing process was
 ...analyzed from the user perspective. Then each steps were added to the testing process. To test the google search button
 ... the "akirolabs" phrase was selected and added. To be ensure that the results were shown or not, 
 ...some sort of selenium-testNG-jUnit assertions types and methods were used like getting title and the page of current Url
 Each steps of testing process ware observed closely and testing process was complated successfully.
 ...



