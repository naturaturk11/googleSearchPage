# googleSearchPage
------------As a framework used in the project:-------------
A Google search action was thoroughly tested within a Java Selenium Cucumber project. In this project, we utilized Java as the programming language and employed Selenium as our automation tool, with Maven as the build automation tool. We also adopted the Cucumber framework with BDD (Behavior-Driven Development) using the Gherkin language to facilitate comprehensibility.

JUnit and TestNG were both employed to manage the project, and assertions played a pivotal role in verification.

To structure the testing process, we organized features into a package located under the Resources Directory, specifying steps for scenarios.

The POM.xml file served as the repository for dependencies and essential plugins, each version carefully accounted for.

We introduced the Configuration.properties directory to store basic information in key=value format, promoting project control, and mitigating hard coding in favor of easily accessible common information.

The central concept of the project was the Page Object Model (POM), with a 'pages' package designed for web element location. This approach streamlined code changes and facilitated the use of located elements in coding. We created two types of pages to maintain clarity throughout the coding process.

We harnessed the power of IntelliJ IDEA for project development. In terms of execution, we crafted two runner classes—one for running all the codes and another, FailedTestRunner, specifically for testing failed codes.

Within the Cukes Runner, we integrated paths for features and step definitions, and we incorporated plugins for comprehensive reporting. Tags were utilized to denote executed parts.

In the step definition section, two classes were created. One contained codes and assertions, while the other, 'hook,' was designed to capture screenshots upon detecting failures.

The utilities section featured a Driver as a singleton design pattern for code execution, and we implemented a Configuration Reader to extract information from configuration.properties.

We enhanced efficiency and safety with commonly used methods tucked away inside BrowserUtils.

For reporting, we incorporated the Cucumber reporting plugin to gain a clear understanding of results and to access detailed analyses through the Cucumber report.

---Testing and Assertion Process---
The main Google page underwent a user-oriented analysis to ensure the functionality of the search button. We approached this testing process from a user's perspective, meticulously adding each step. To verify the Google search button's functionality, we selected and entered the search phrase "akirolabs." To ascertain whether results were displayed, we employed various Selenium-TestNG-JUnit assertion types and methods, including title retrieval and monitoring the current URL.

Every step of the testing process was meticulously observed, resulting in the successful completion of the testing process.









