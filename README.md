🃏 Memory Game (Java Console)

A simple 2-player memory matching game written in Java, where players flip cards and try to find matching pairs.
The player with the most pairs at the end wins! 🎯

📌 Features

Console-based Memory Game in Java

2-player mode (alternating turns)

Randomized board every game (cards shuffled)

Players flip 2 cards each turn

Matching pairs increase the player’s score

Board updates dynamically after each move

Game ends when all pairs are found → Winner is declared

🖼 Example Gameplay
=== Welcome to the 2-Player Memory Game ===

--- Player 1's turn ---
Board:
[ 0 ] [ 1 ] [ 2 ] [ 3 ] [ 4 ] [ 5 ] [ 6 ] [ 7 ]
Enter index of first card: 0
Board:
[ A ] [ 1 ] [ 2 ] [ 3 ] [ 4 ] [ 5 ] [ 6 ] [ 7 ]
Enter index of second card: 3
Board:
[ A ] [ 1 ] [ 2 ] [ B ] [ 4 ] [ 5 ] [ 6 ] [ 7 ]
>> Not a match!

--- Player 2's turn ---
Board:
[ 0 ] [ 1 ] [ 2 ] [ 3 ] [ 4 ] [ 5 ] [ 6 ] [ 7 ]
...

⚙️ How to Run

Compile the Java file:

javac Memory.java


Run the program:

java Memory

🎮 Game Rules

The game starts with a shuffled set of pairs of cards (A, B, C, D, ...).

Players take turns flipping two cards by entering their indexes.

If both cards match → The player scores 1 point and gets another turn.

If not → The cards flip back, and the turn passes to the other player.

The game ends when all pairs are found.

The player with the most pairs wins.

📂 Project Structure
Memoryr.java   # Main game source code
README.md      # Project documentation

🚀 Future Enhancements

✅ Add timer to track how long the game takes

✅ Add single-player mode vs Computer AI

✅ Add GUI version using Java Swing/JavaFX

🏆 Author

👩‍💻 Developed by : Hemadharshini K

✨ Enjoy the game and feel free to star ⭐ this repo if you like it!
