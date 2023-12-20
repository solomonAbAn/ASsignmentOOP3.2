










//// Part I) 


////In this part, you need to create a class called LadderAndSnake. 


////A LadderAndSnake object has a board of 10x10 and a number of players attached to it, which is initialized at the creation time of the object. 


////The number of players must be between 2 and 4 inclusively. The number of players must be set through the use of a parameterized constructor of the class. 


////In addition, the board itself is set as shown in Figure 1 below.


//Besides the constructors, and all basic methods in the class, the class must include two methods, one called flipDice(), which should return a random value between 1 and 6 inclusively. 


//The other method is called play(), which actually initiate the core engine of the game where the players start to play the game. The rules of the game are as below: 


//•	Before any of the players starts playing, the order of playing turns must be determined. 


//For that, each player must throw the dice to obtain the largest possible number. 


//In case of a tie between any of the players, the process is repeated only between those players. 


//This process is concluded once the order of playing is determined. 


//•	At this point, the players start playing the game by alternating dice flipping. 


//•	Each dice flip will move a player form square 0 (which you can think about it as outside the board) with the value of the dice. 


//For example, if a player is at square 0 and the dice value was 5, then the player moves to square 5. 


//•	If the reached square has a bottom of a ladder, then the player moves up to the square that has the top of the ladder. 


//For instance, if a player is at square 33, and the flipped dice value was 3, then the player moves to square 36, which in turn will end moving the player up to square 44. 


//•	If the reached square has a head of a snake, then the player moves down the square that has the tail of the snake. 

//For instance, if a player is at square 77, and the flipped dice value 2, then the player moves to square 79 (which has the tip of the snake’s head), 


//which in turn end moving the player down to square 19. 


//You will have to find a way to record the relation between these particular ladder and snake squares 


//•	The game is concluded once any of the players EXACTLY, reaches square 100. 


//•	If a player is close to 100, and the dice value exceeds the maximum possible moves, the player moves backward with the excessive amount. 


//For instance, if a player is at square 96 and the dice value is 5, then the player moves to 99 (that is 4 moves to 100, then 1 move backward to 99). 


//As a general requirement, you must show/display ALL operations of the game. For instance, at start, you should indicate something like: 



//•	Game is Played by x players (where x is the number of players set for that game);


//•	Now deciding which player will start playing; 


//•	Player 1 got a dice value of 5 


//Player 2 got a dice value of 3 


//Player 3 got a dice value of 3 


//A tie was achieved between Player 2 and Player 3. Attempting to break the tie 


//Player 2 got a dice value of 2 


//Player 3 got a dice value of 6 


//•	Reached final decision on order of playing: Player 1, Player 3, Player 2 


//•	Player 1 got a dice value of 5; now in square 5 


//•	Player 3 got a dice value of 6; now in square 6 


//•	Player 2 got a dice value of 4; gone to square 4 then up to square 14 


//•	Game not over; flipping again 


//•	Player 1 got dice value of 4; gone to square 9 then up to square 31 


//•	Player 3 got dice value of 4; now in square 10 


//•	Player 2 got dice value of 2; gone to square 16 then down to square 6 


//•	Game not over; flipping again 


//The above sample of displays is the basic minimum that you should have. 


//A better mark is given for implementing the board as a 2-D array, and for a more elaborate/creative displays (i.e. possibly visibly showing the plays/moves, 


//giving each of the players a name, etc. There is no limit of what you can do here. Be impressive!).






























