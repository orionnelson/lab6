# lab6 [![codecov](https://codecov.io/gh/orionnelson/lab6/branch/main/graph/badge.svg?token=dJEEOahZ8n)](https://codecov.io/gh/orionnelson/lab6/branch/main)

![codecov](https://codecov.io/gh/orionnelson/lab6/branch/main/graph/sunburst.svg?token=dJEEOahZ8n)

This is a test change the repo link for actual usage of codecov.

Read The Javadoc Here : https://or9.ca/Lab6/

Short video demo: https://youtu.be/BoLrKZb8shM


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


An observer is a class that takes in a value (a number) and updates itself when a change happens.

The observer pattern is used to notify others of changes that happen. In this example, an observer is added to the text box and when the text box changes the observer updates itself.

### Output

Conversion is done using input and Javas built in operations.

## Data Structures

### Collection

A collection is a set of objects with the same type. Collections are used to store a set of objects and their properties.

### Inheritance

Inheritance is the concept that allows for the creation of new classes based on existing ones. In this example, the parent class is `AbstractConverter` which has all the common properties for the converter. The child class is `Converter` which has all the properties unique to this class.


## Runtime Code

* Main()
* AbstractConverter()
* Converter()
* SwingUtilities.invokeLater()
* SortedList.sort()
* SortedList.add()
* SortedList.remove()
* SortedList.get()

If the `SoccerBall` shot by `Striker` lands in the gate area, the `goal` of the current game will
increment by 1, game will set to `pause`, and the position of `SoccerBall`, `Stiker` and `Goalkeeper` will be reset.

If the `SoccerBall` shot by `Striker` lands in its side of the penalty line, nothing will happen.

If the `SoccerBall` shot by `Striker` lands in the other side of the penalty line, and not in the
gate area, `Goalkeeper` will catch the `SoccerBall` automatically and considered have **caught 1 ball**.
Then `Goalkeeper` will kick the `SoccerBall` back to the `Striker` side of the penalty line.

### Game states

Game is `over` if and only if the remaining time is `0`.

If the game is on `pause`, neither `GamePlayer` nor `SoccerBall` can move.

If the game is `over`, the statistics of each `GamePlayer` will be sorted and displayed, while all controls,
including `pause` and `resume` will be disabled until a new `SoccerGame` is started.

## Screenshots

| In game    | Game over   |
| :------------: | :----------: |
| ![In game](screenshots/in_game.png) | ![Game over](screenshots/game_over.png) |
`=`
| Javadoc: https://or9.ca/soccer | CodeCov: https://app.codecov.io/gh/orionnelson/football-game |
| Demo: https://youtu.be/2aL0P4bcZAM |                                                          |

### football-game 


### Testing Methods 
## Testing Was Done Using GitHub Workflows
Using github workflows for testing we were able to automaticly generate our testing coverage and evaluating test cases to rule out bugs in the code. 

We used this github wiki for this
https://github.com/robotframework/robotframework/wiki/Testing-Design

In the Testing Design we broke down the Test Groups into two types of testing.

| Test Case	 |		Test Design | 
| :--------: | :---------:  |
| Listener Tests	|		Contains tests that test the user interface with robot |
| Menu Tests		|		Tests the Model and Listener Tasks for the Menu |
| Model Tests		|	Tests the Model |
| View Tests |   Quit Test Case Verified manually |

## Model Coverage

| ![Model Coverage](https://or9.ca/soccer/testitems/model%20coverage.png) |
| ![Model Coverage](https://or9.ca/soccer/testitems/src%20model.png) |

## Test Case Breakdown
The Test Cases Were Broken Down Into Three Catagories
## Test Case Specifics / Implemented Design
|      Id        |  TestGroup   |   Description |
| :------------: | :----------: | :----------:  | 
|  | ListenerTests     |   Dealt with making sure that all the input mappings and core events were working correctly `Robot` keyevent    |
|  | MenuListenerTests |  Worked with the menu events and performed tests using `java.awt.Robot` with mousevent/keyevent                 | 
|  |   ModelTests     |  Tests Model Init and and if all of the methods of model are working correctly                                   |

## Platforms 

Testing was done on the following platforms = [`Windows-Latest`, `Ubuntu-Latest`] and due to restrictions with Maveren for our workflow we had to drop support for older versions of Java so we ended using JDK = [`11`, `16`].

### Listener Tests 
| Listener  Test Case                                           | 
| :-----:                                                       |
| ![Listener](https://or9.ca/soccer/testitems/TestListener.png) |

Our first set of tests were the listener tests. This was a set of tests that worked on the user interface with robot. To test the user interface we used the Robot class and the JFrame for testing. The Robot class was used for testing the KeyEvents and mouseEvents, and the JFrame for testing the input mappings and mouse events. The Robot class was used for testing the key events by moving the mouse over the JFrame and pressing the buttons to simulate a user using the JFrame.

The user interface tests were broken down into three categories. The first category was the Core Input mappings. These tests were tests for the core input mappings that we used for the application. The second category was the Menu Tests. This was a set of tests for the model that were focused on the menu and its functionality.

| Menu Listener Test Cases                                         | 
| :-----:                                                          |
| ![Listener](https://or9.ca/soccer/testitems/Menu%20Listener.png) |
|                                                           |
|   ![TestListener](https://user-images.githubusercontent.com/44347765/141044983-e7205133-b400-4a89-b2e6-3aab4695b453.gif)  |
|  The menu listener in action                                     |


### Model Tests 

The third category was the Model Tests. These tests were focused on the model and tested the functionality of the methods.  The tests were designed to test the predictability and consistency of the methods, and the results were recorded and compiled into a test matrix. The test matrix was then used to determine the overall reliability of the model.
| Model  Test Cases                                             | 
| :-----:                                                       |
| ![Model](https://or9.ca/soccer/testitems/TestModels.png) |




