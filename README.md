# googleSearchPage
In the project, a Google search action was thoroughly tested within a Java Selenium Cucumber project. In this project, Java was employed as the programming language, Selenium was utilized as the automation tool, and Maven was used as the build automation tool. The Cucumber framework with BDD (Behavior-Driven Development) using the Gherkin language was adopted to facilitate comprehensibility.

The project was managed using both JUnit and TestNG, and a pivotal role in verification was played by assertions.

To structure the testing process, features were organized into a package located under the Resources Directory, and steps for scenarios were specified.

The repository for dependencies and essential plugins was provided by the POM.xml file, with careful consideration given to each version.

The Configuration.properties directory was introduced to store basic information in key=value format, promoting project control and mitigating hard coding in favor of easily accessible common information.

The central concept of the project was the Page Object Model (POM), with a 'pages' package designed for web element location. This approach streamlined code changes and facilitated the use of located elements in coding. Two types of pages were created to maintain clarity throughout the coding process.

The power of IntelliJ IDEA was harnessed for project development. In terms of execution, two runner classes were crafted—one for running all the codes and another, FailedTestRunner, specifically for testing failed codes.

Within the Cukes Runner, paths for features and step definitions were integrated, and comprehensive reporting was incorporated using plugins. Tags were utilized to denote executed parts.

In the step definition section, two classes were created. One contained codes and assertions, while the other, 'hook,' was designed to capture screenshots upon detecting failures.

The utilities section featured a Driver as a singleton design pattern for code execution, and a Configuration Reader was implemented to extract information from configuration.properties.

Efficiency and safety were enhanced with commonly used methods tucked away inside BrowserUtils.

For reporting, the Cucumber reporting plugin was incorporated to gain a clear understanding of results and to access detailed analyses through the Cucumber report.

---Testing and Assertion Process--- A user-oriented analysis was performed on the main Google page to ensure the functionality of the search button. This testing process was approached from a user's perspective, with each step meticulously added. To verify the functionality of the Google search button, the search phrase "akirolabs" was selected and entered. Various Selenium-TestNG-JUnit assertion types and methods, including title retrieval and monitoring the current URL, were employed to ascertain whether results were displayed.

Every step of the testing process was meticulously observed, resulting in the successful completion of the testing process.















