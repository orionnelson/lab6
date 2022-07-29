# lab6 [![codecov](https://codecov.io/gh/orionnelson/lab6/branch/main/graph/badge.svg?token=dJEEOahZ8n)](https://codecov.io/gh/orionnelson/lab6/branch/main)[![Javadoc](https://img.shields.io/static/v1?label=Javadoc&message=view&color=yellow)](https://or9.ca/soccer) [![Demo](https://img.shields.io/static/v1?label=Demo&message=view&color=green)](https://youtu.be/BoLrKZb8shM) [![Report](https://img.shields.io/static/v1?label=Report&message=view&color=orange)](https://github.com/orionnelson/lab6/raw/main/Report%20-%20v1.pdf)

TA: Kazi Mridul, kmridul@yorku.ca

A unit converter written in Java 11 using Java Swing.

Featuring design pattern/principle:

* Observer
* Iterator
* Factory
* Collection
* Polymorphism
* Inheritance

## Control

### Input

Select the text box to change the number of centimeters inputed then click the `menubar` to update the conversion.


### Objective Conversion Using the Observer Pattern


An observer is a class that takes in a value (a number or string) and updates itself when a change happens.

The observer pattern is used to notify others of changes that happen. In this example, an observer is added to the text box and when the text box changes the observer updates itself.

### Output

Conversion is done using input and Javas built in operations.

## Data Structures

### Collection

A collection is a set of objects with the same type. Collections are used to store a set of objects and their properties.

### Inheritance

Inheritance is the concept that allows for the creation of new classes based on existing ones. In this example, the parent abstract class is `ConcreteSubject` which has all the common properties for the converter. The child class is `Converters` which has all the properties unique to these classes depending on their implementation methods.


## Runtime Code
Runs a new ProgFrame which Calls other Actions

### Game states
On Error the cm value is set to "".
On a valid value when accessing the menu bar the calculation is given in the respective boxes.

## Screenshots

| In App    |    |
| :------------: | :----------: |
| ![In App](https://or9.ca/soccer/img/AppRunning.png) |  |
`=`
| Javadoc: https://or9.ca/soccer | CodeCov: https://codecov.io/gh/orionnelson/lab6/ |
| Demo: https://youtu.be/BoLrKZb8shM |                                                          |

### lab6 converterApp

## Testing Was Done Using GitHub Workflows
Using github workflows for testing we were able to automaticly generate our testing coverage and evaluating test cases to rule out bugs in the code. 

### Workflow Component Actions BreakDown
| Component    | Usage   |
| :------------: | :----------: |
| matrix_build |  Virtualized OS Ubuntu |
| actions/checkout@v2  | default action clones repo | 
| sudo apt-get install graphviz | setup graphviz | 
| actions/setup-java@v1 | setup java build with versions `11` and `16` |
|  actions/cache@v2 | Time save caching required between runs |
| GabrielBB/xvfb-action@v1 | Screen options get accurate interface options for Robots |
|  mvn -B test --file pom.xml | Mavern Build *Read Pom for Detailed Actions* |
| jacoco | Inside mavern Build | 
| javadoc | Inside mavern Build | 
| nl.talsmasoftware.umldoclet.UMLDoclet |  used for generation of javadoc Diagrams |
| attach-javadocs jar | create Jar Lib Javadoc companion |
|  mvn --batch-mode --update-snapshots verify | generate Mavern Build Jar  |
| actions/upload-artifact@v2 | Upload Lib and Javadoc Jar To Artifacts (Click Build Summary) | 


In the Testing Design Model Testing Targeted the View as shown in the javadoc Class layout.

| Test Case	 |		Test Design | 
| :--------: | :---------:  |
| Model Tests		|	Tests the Model and View |

## Model Coverage
| Model Coverage |
| :--------: |
| ![Model Coverage](https://or9.ca/soccer/img/ModelCoverage.png) |
|   ![Model Structure](https://or9.ca/soccer/img/ModelScreenShot.png) |
| ![codecov](https://codecov.io/gh/orionnelson/lab6/branch/main/graph/icicle.svg?token=dJEEOahZ8n) |


## Platforms 

Testing was done on the following platforms = [`Windows-Latest`, `Ubuntu-Latest`] and due to restrictions with Maveren and workflow generation for our workflow we had to drop support for older versions of Java so we ended using JDK = [`11`, `16`] and only Ubuntu.                             |


### Model Tests 
 These tests were focused on the model and tested the functionality of the methods.  The tests were designed to test the predictability and consistency of the methods, and the results were recorded and compiled into a test matrix. The test matrix was then used to determine the overall reliability of the model.
| Model  Test Cases                                             | 
| :-----:                                                       |
| ![Model](https://or9.ca/soccer/img/ModelTesting.png) |




