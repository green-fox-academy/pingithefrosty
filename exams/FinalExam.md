# FinalExam
This repository is to support Barni's final exam at Green Fox Academy.
# Foundation requirements
## Accomplishments
- [Contribution to the project](https://github.com/greenfox-academy/matchmaking/graphs/contributors)
- [My repo](https://github.com/pingithefrosty)  
- [Matchmaking project repo](https://github.com/greenfox-academy/matchmaking/)
## Skills
The student, on their own, is able to:
 -  Use the command line:
     -  Traversing directories (cd, cd ..)
     -  Moving, copying, creating, deleting files (mv, cp, rm, touch)
     -  Passing command line arguments to commands (in the appliaction)
 -  Use git:
     -  Commit, add, push, pull [matchmaking repo](https://github.com/greenfox-
academy/matchmaking/)
     -  Review other's code [matchmaking repo](https://github.com/greenfox-academy/matchmaking/)
 -  Follow indentation and coding styleguides in their code (check any code)
 -  Create variables and methods on a given specification
 -  [Use conditions and loops:](https://github.com/greenfox-academy/pingithefrosty/blob/master/exams/corsac-basic-exam/mutual-elements/src/MutualElements.java)
     -  Filtering
     -  Finding elements or index
     -  Generating lists
     -  Checking multiple values and counting
     -  Mapping values
 -  Use object orientation:
     -  Create and inherit classes including fields and methods on a given specification. [garden exercise]
(https://github.com/greenfox-academy/pingithefrosty/tree/master/week4/day2/GardenApplication/src)
     -  Understanding the difference between classes and objects
     -  Instantiating and using objects [todo app](https://github.com/greenfox-academy/pingithefrosty/tree/master/week8/day1/sqlspringpractice/src/main/java/com/greenfoxacademy/sqlspringpractice)
     -  Understanding "this" keyword
 -  Handle errors and exceptions
 -  Determine the output of expressions
 -  Explain their own code
 -  Write unit tests for functions and methods [link for integration test]
(https://github.com/greenfox-academy/pingithefrosty/blob/master/week9/day2/src/test/java/com/greenfox/day2/RestpracticeApplicationTest.java)  
 [link for unit test](https://github.com/greenfox-academy/matchmaking/blob/JAR-51-Feri/src/test/java/com/greenfoxacademy/matchmaking/services/ApprenticeServiceTest.java)
 # Backend Orientation Exam Competencies
## Interfaces and abstract classes
- usage of interfaces and abstract classes
- understanding the difference between interfaces and abstract classes [external link](https://i.stack.imgur.com/pghvG.jpg)
- understand when to use interface and when to use super class [diamond problem](https://www.journaldev.com/1775/multiple-inheritance-in-java)
## Queries
- usage of language integrated quaries e.g. LINQ/StreamApi
- understanding the syntax (=.=)
- able to write simple custom quaries [space repository](https://github.com/pingithefrosty/corsac-orientation-exam/blob/master/src/main/java/com/greenfox/pingithefrosty/spacetransporter/repositories/SpaceShipRepository.java)
## Build tool
- use build tools to build and run your applications e.g. gradle/.Net CLI
- dependency definition
- able to restore 3rd party library dependencies [sendgrid](https://github.com/greenfox-academy/matchmaking/blob/development/src/main/java/com/greenfoxacademy/matchmaking/services/EmailService.java)  
## 3rd party libraries
- able to add and use libraries [link for injecting dependencies](https://github.com/greenfox-academy/matchmaking/blob/development/build.gradle)
- find documentation and usage examples [link for documentation](https://sendgrid.com/docs/API_Reference/index.html)
## Backend Framework
- creating a Web Application with the given backend framework e.g. Spring/ASP.Net Core (can check
any code for spring)
- understanding the used components
- find documentation and usage examples
- understanding the framework and the application as web backend
- able to create examples for competencies of web backend
- using a templating system e.g. Thymeleaf/Razor Pages [controller link](https://github.com/pingithefrosty/corsac-orientation-exam/blob/master/src/main/java/com/greenfox/pingithefrosty/spacetransporter/controllers/SpaceWebController.java)  
[thymeleaf link](https://github.com/pingithefrosty/corsac-orientation-exam/blob/master/src/main/resources/templates/main.html)
- able to use the framework's special Dependency Injection system (autowire)
- usage of the framework's IoC container[link](https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/beans.html)
- able to alter basic configurations
- understanding the flow of HTTP [link for external description](https://stackify.com/spring-mvc/)
## Data persistance
- understanding and usage of basic SQL commands [link to external source](https://www.w3schools.com/sql/default.asp)
  - `select` (SELECT * FROM table_name;)
  - `insert` (INSERT INTO table_name (column1, column2, column3, ...)
VALUES (value1, value2, value3, ...);)
  - `update` (UPDATE table_name
SET column1 = value1, column2 = value2, ...
WHERE condition;)
  - `delete` (DELETE FROM table_name
WHERE condition;)
- connecting database to backend application [link to application properties](https://github.com/greenfox-academy/pingithefrosty/blob/master/week8/day1/sqlspringpractice/src/main/resources/application.properties)
  - database framework configuration
- understanding Object Relational Mapping [picture of this](https://i.pinimg.com/originals/a9/dc/21/a9dc21b8c2c081ec1d43ea15a81ae497.jpg)
  - with using library: JPA/EF Core [documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- connection between:
  - tables and classes
  - records and objects
  - columns and fields/properties
Hibernate: (Hibernate ORM is an object-relational mapping tool for the Java programming language.
It provides a framework for mapping an object-oriented domain model to a relational database.
Hibernate is an ORM framework - you describe how your objects are represented in your database,
and hibernate handles the conversion)   
[link for representing hybernate](https://www.javatpoint.com/images/hibernate/architecture.jpg)   
[simple explanation](https://www.quora.com/What-does-Hibernate-do-in-Java-in-simple-language)
JPA: (The Java Persistence API (JPA) is a Java application programming interface specification
that describes the management of relational data in applications. JPA gives us CrudRepository
extension for example.)   
[link to represent JPA usage](http://javasampleapproach.com/wp-content/uploads/2017/08/angular-4-spring-jpa-mysql-spring-boot-architecture.png)   
[JPA explanation for noobs](https://www.quora.com/What-is-Spring-Data-JPA-in-simple-words)
JDBC: (Java Database Connectivity is an application programming interface for the programming
language Java, which defines how a client may access a database. JDBC is the API for database
access, and it works "in a relational way" - you query tables and get rows and columns back.
Hibernate uses JDBC under the hood to fetch the data and later convert it to objects.)   
[link for making it clear what the JDBC is](https://www.tutorialspoint.com/jdbc/images/jdbc-architecture.jpg)   
ORM: (Object Relational Mapping; ORM allows you to use java objects as representation of a
relational database. It maps the two concepts (object-oriented and relational))  
[link to visually represent ORM](https://i.stack.imgur.com/seqRv.jpg)
## Web backend
- domain
- parts of the URL (protocol such as http; domain name such as www.google.com; directory such as
/app/; filename and extension such as main.html) [link](http://sagargola.com/wp-
content/uploads/2017/02/Understanding-URL-Elements-of-URL-Secure-URL.png)
- endpoint
- HTTP (Hypertext Transfer Protocol)
  - Requests
  - Response
  - methods (get, post, put, delete)
- headers
- body
- templates
Whenever your web browser fetches a file (a page, a picture, etc) from a web server, it does so
using HTTP - that's "Hypertext Transfer Protocol".  HTTP is a request/response protocol, which
means your computer sends a request for some file (e.g. "Get me the file 'home.html'"), and the
web server sends back a response ("Here's the file", followed by the file itself)
### REST Web backend
- understand what is an API and can use it
- use JSON objects
- understand the concept of serialization [explanation](https://philsturgeon.uk/api/2015/05/30/serializing-api-output/)
- able to use Postman
Serilization: (Java provides a mechanism, called object serialization where an object can be
represented as a sequence of bytes that includes the object's data as well as information about
the object's type and the types of data stored in the object. After a serialized object has been
written into a file, it can be read from the file and deserialized that is, the type information
and bytes that represent the object and its data can be used to recreate the object in memory.)  
## Endpoint tests
- able to make difference between unit test and integration test
- create endpoint test with the help of a mock server [link](https://github.com/greenfox-academy/pingithefrosty/blob/master/week9/day2/src/test/java/com/greenfox/day2/RestpracticeApplicationTest.java)
Unit test: (A unit test is a test written by the programmer to verify that a relatively small
piece of code is doing what it is intended to do.)   
Integration test: (An integration test is done to demonstrate that different pieces of the system
work together. Integration tests cover whole applications, and they require much more effort to
put together. They usually require resources like database instances and hardware to be allocated
for them.)
  # Final exam requirements
## Accomplishments
 -  Significant contribution to the team project
 -  High understanding of project structure
## Skills
### Common
The student, on their own, is able to:
 -  Use git:
     -  Resolving a simple merge conflict (resolved even more complex ones :))
     -  Creating a pull request [link to pull requests](https://github.com/greenfox-academy/matchmaking/pulls)
 -  Understand API documentation
 -  Understand token based authorization [link google token]
(https://github.com/greenfox-academy/matchmaking/blob/development/src/main/java/com/greenfoxacademy/matchmaking/configs/SecurityConfig.java)
 -  Refactor code
     -  Create meaningful names for methods, classes and variables
     -  Split bigger functions to smaller ones [fb parser project](https://github.com/pingithefrosty/fb-chat-java-parser/blob/master/src/Main.java)
     -  Separate functionalities to different files [look at all the services](https://github.com/greenfox-academy/matchmaking/tree/development/src/main/java/com/greenfoxacademy/matchmaking/services)
     -  Point out code smells (unused variables, not closed resources, bat patterns)
 -  Understand base concept of hosting [link for my heroku](https://whispering-ridge-82939.herokuapp.com/)
 -  Deployment and continuous integration (jenkins + AWS needed, Heroku OK)
 -  Using design patterns (for example MVC design Pattern; I am always using it)
 -  Integration testing (see above)
 -  Differentiate between backend and frontend (client) functionality
### Backend
 -  Use async structures:
     -  Writing functions that are taking and calling callbacks
     -  Determining the calling order in nested callbacks (If the answer is dependent on other resources (e.g REST API), and if you want to call other resources with the result of the first one, obvoiusly the second one has to wait until the firsts answer is arrived.)
 -  Authentication: (Google authentication + token based authentication in checkout application)
     -  Handle authentication [google auth](https://github.com/greenfox-academy/matchmaking/blob/development/src/main/java/com/greenfoxacademy/matchmaking/configs/SecurityConfig.java)
     -  Handle token based authorization
 -  Database
     - Using complex data structures (user, partner, apprentice and preference)
     - Understanding and using table connections [see matchmaking model structure](https://github.com/greenfox-academy/matchmaking/tree/development/src/main/java/com/greenfoxacademy/matchmaking/models)
     - Understanding migration [step-by-step guide](https://flywaydb.org/getstarted/firststeps/gradle)
Relational database: (A relational database is a collection of data items organized as a set of
formally-described tables from which data can be accessed or reassembled in many different ways
without having to reorganize the database tables.)

