# lab6 [![codecov](https://codecov.io/gh/orionnelson/lab6/branch/main/graph/badge.svg?token=dJEEOahZ8n)](https://codecov.io/gh/orionnelson/lab6/branch/main)


This is a test change the repo link for actual usage of codecov.



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
Runs 


### Game states

On Error the value is set to "".
On a valid value when accessing the menu bar the calculation is given in the respective boxes.

## Screenshots

| In game    | Game over   |
| :------------: | :----------: |
| ![In game](screenshots/in_game.png) | ![Game over](screenshots/game_over.png) |
`=`
| Javadoc: https://or9.ca/Lab6 | CodeCov: https://codecov.io/gh/orionnelson/lab6/ |
| Demo: https://youtu.be/BoLrKZb8shM |                                                          |

### lab6 converterApp


### Testing Methods 
## Testing Was Done Using GitHub Workflows
Using github workflows for testing we were able to automaticly generate our testing coverage and evaluating test cases to rule out bugs in the code. 

We used this github wiki for this
https://github.com/robotframework/robotframework/wiki/Testing-Design

In the Testing Design Model Testing Targeted the View as shown in the javadoc Class layout.

| Test Case	 |		Test Design | 
| :--------: | :---------:  |
| Model Tests		|	Tests the Model and View |

## Model Coverage
| Model Coverage |
| :--------: |
| ![Model Coverage](https://or9.ca/soccer/testitems/model%20coverage.png) |
| ![codecov](https://codecov.io/gh/orionnelson/lab6/branch/main/graph/sunburst.svg?token=dJEEOahZ8n) |


## Platforms 

Testing was done on the following platforms = [`Windows-Latest`, `Ubuntu-Latest`] and due to restrictions with Maveren and workflow generation for our workflow we had to drop support for older versions of Java so we ended using JDK = [`11`, `16`] and only Ubuntu.                             |


### Model Tests 

The third category was the Model Tests. These tests were focused on the model and tested the functionality of the methods.  The tests were designed to test the predictability and consistency of the methods, and the results were recorded and compiled into a test matrix. The test matrix was then used to determine the overall reliability of the model.
| Model  Test Cases                                             | 
| :-----:                                                       |
| ![Model](https://or9.ca/soccer/testitems/TestModels.png) |




