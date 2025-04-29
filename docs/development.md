# Development Log

The development log captures key moments in your application development:

- **Design ideas / notes** for features, UI, etc.
- **Key features** completed and working
- **Interesting bugs** and how you overcame them
- **Significant changes** to your design
- Etc.

---

## Date: 28/04/25

If you attepted to put a non-int in a spot where it asked for an int, the program threw an error, which I've now fixed. 


---

## Date: 28/04/25

If the user selected they wanted to move the coin at an index that was out of bounds, the program threw an error. I had already added a check for this, put put it in the wrongf place. A simple rearrange fixed this. 


---

## Date: 29/04/25

If, when prompted, the user put a random string of characters into it, the program returned 'please choose a coin!' instead of 'please choose a square!' I fixed this soon after. 
![Incorrect Text](screenshots/MoveCoinToLetterDV.gif)

I then changed the terminology so it's more correct. 

![Correct Text](screenshots/MoveCoinToLetter.gif)

---

## Date: 29/04/25

Found a bug where when removing a coin, it would remove the square that the coin was in. I fixed this by replacing the 'board.removeAt[0]' to 'board0 = EMPTY' 


---

## Date: xx/xx/20xx

Example description and notes. Example description and notes. Example description and notes. Example description and notes. Example description and notes. Example description and notes.

![example.png](screenshots/example.png)

---


