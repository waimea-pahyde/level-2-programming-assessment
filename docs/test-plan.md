# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## The coins get added to the board

A random number of silver coins and 1 gold coin should get added to the board.

### Test Data To Use

I will run the game multiple times to check if the coins get added.
### Expected Test Result

The coins get added to the board. 

---



## Boundry testing the moved coins

If the user tries to pick a square outside the board for a coin to move. 

### Test Data To Use

I will run the program twice, and when it asks to pick a coin, enter 21 and -1
### Expected Test Result

The program will say 'please pick a coin to move'

---


## Invalid testing, if a player picks a square with a coin that isn't there

If the user picks a square that is empty and doesn't have a coin for the coin they want to move prompt.

### Test Data To Use

I will run the test multiple times, and each time select a square with a coin that isn't there

### Expected Test Result

The program should give an error message and loop. 

---

## Boundry testing - If the user moves their coin to an invalid spot

If when prompted, the user chooses to move their coin to a square that doesn't exist, like square 21, or -4. 

### Test Data To Use

I will run the program multiple times, and when prompted, enter in 21 and -4 as the sqaure I want to move my coins to. 
### Expected Test Result

The program will return an error messgae. 

---
## Invalid - If the3 user wants to move their coin to a square with a coin in it

If, when prompted the user selects to move their coin to a square that does not exist. 

### Test Data To Use

Details of test data and reasons for selection. Details of test data and reasons for selection. Details of test data and reasons for selection.

### Expected Test Result

Statement detailing what should happen. Statement detailing what should happen. Statement detailing what should happen. Statement detailing what should happen.

---



## Invalid - if the user puts something random in for their prompt

If, when prompted to move a coin or select a coin to move, the user puts letter, or some other invalid character type it. 
### Test Data To Use

I will run the program and put letters/words in. 
### Expected Test Result

The program will prompt the user to put a numhber in and loop 

---


## Valid - Coin moves

When the user selects the corredct place to move the coins and the correct coin the coin moves to the place selected by the user.
### Test Data To Use

I will run the program, and input the valid test data into it. 
### Expected Test Result

The program will place the coin in the correct placement.

---


## Valid - PLayers can take turns. 

Tjhe program prompts the correct user  to take a turn
### Test Data To Use

I will run the game, and play for a bit to make sure the program always prompts the correct user to takw a turn. 
### Expected Test Result

The program prompts the correct user to take a turn . 

---

## valid - Players can enter numbers as their name.

If the user inputs a number or a space as their name, the program accepts it as the name they want, and doesn't crash.

### Test Data To Use

I will run the program multiple times, Inputting values such as '2934' and ' ' as my name when prompted. 

### Expected Test Result

The program treats this as if this is the player name and does not crash. 

---


## Valid - long names

PLayer inputs a really, really, long player name. 

### Test Data To Use

I will input two really long player names 
### Expected Test Result

The program will accept the player name, in case the player just has a really long name. 

---

## Invalid - If coins get moved backwards

If when prompted, the user opts to move their coin backwards. 

### Test Data To Use

When prompted to pick a square to move my ocin into, I will select a square which is behind my coin.

### Expected Test Result

The program will inform the user that they can't move their coin backwards. 

---



