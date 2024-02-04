# Project Description: ATM Interface in Java with OOP Concepts

This Java project, named `ATM Interface`, models an Automated Teller Machine (ATM) using Object-Oriented Programming (OOP) concepts. It consists of several classes, each responsible for specific aspects of the ATM functionality.

### Classes and OOP Concepts:

1. **Account Class (Encapsulation):**
   - **Encapsulation** is employed by making the `balance`, `withdraw`, and `deposit` private attributes of the `Account` class.
   - **Getter and Setter methods** (`getBalance`, `updateBalance`, `getWithdraw`, `updateWithdraw`, `getDeposit`, `updateDeposit`) provide controlled access to these attributes.

2. **OperationInterface Interface (Abstraction):**
   - **Abstraction** is achieved by defining an interface (`OperationInterface`) that declares the methods for various operations without specifying their implementation details.
   - The methods (`viewBalance`, `withdraw`, `deposit`, `viewStatement`) serve as an abstraction layer for interacting with the `Operations` class.

3. **Operations Class (Encapsulation and Inheritance):**
   - **Encapsulation** is used to encapsulate the internal state (transaction history) of the `Operations` class.
   - The `OperationInterface` is implemented, showcasing **inheritance**.

4. **Atm Class (Polymorphism and Composition):**
   - **Polymorphism** is demonstrated when the `Atm` class interacts with the `OperationInterface`. It can use any class that implements this interface (`Operations` in this case).
   - **Composition** is seen in the `Atm` class, which contains an instance of `OperationInterface` (`Operations`). This allows flexibility in using different classes that implement the same interface.

### How to Use:

1. Run the `Atm` class to start the ATM interface.

2. Enter the ATM pin for authentication.

3. Choose from the available options (View Balance, Withdraw, Deposit, View Statement, Exit).

4. Perform the desired transaction by following the on-screen instructions.

5. Exit the program when done.

### Running the Program:

Execute the `Atm` class to start the ATM simulation. Follow the on-screen prompts to interact with the ATM and perform various transactions securely.

This program showcases the use of OOP principles to model an ATM system, making the code modular, maintainable, and extensible.

Use this program to understand the basic functionalities of an ATM system and how user authentication, balance management, and transaction tracking are handled.🌐💰💻

# Project Description: Quiz Application in Java

This Java application is a simple quiz game that allows users to answer multiple-choice questions. It's a graphical user interface (GUI) application developed using Swing, a Java GUI widget toolkit.

### Features:

- **Dynamic Questions:** The questions are loaded dynamically from a predefined set of questions.
- **User Interaction:** Users can select one option from the multiple-choice answers.
- **Score Tracking:** The application keeps track of the user's score based on correct answers.
- **Next and Result Buttons:** Users can navigate through questions using the "Next" button and view their final result at the end.
- **Clean GUI:** The application provides a clean and intuitive graphical interface for a seamless user experience.

### How to Use:

1. Starting the Quiz: Run the application, and the first question will be displayed.
   
2. Answering Questions: Choose an option and click "Next" to move to the next question.
   
3. Result: After answering all questions, the "Result" button becomes visible. Click it to see your final score.

Enjoy quizzing! 🚀

# Project Description: Student Grading System in Java

This Java project, named `Student Grading System`, is a simple program that calculates the average marks of a student based on the marks obtained in multiple subjects. The program then assigns a grade based on the calculated average.

### Features:

- **Input Subjects and Marks:** The program prompts the user to input the number of subjects and then takes the marks for each subject.

- **Average Calculation:** It calculates the average marks of the student.

- **Grade Assignment:** Based on the average marks, the program assigns a grade to the student. The grading scale is A+, A, B+, B, C+, C, and Fail.

### How to Use:

1. The program starts by asking the user to input the number of subjects.

2. The user then inputs the marks for each subject.

3. The program calculates the average marks.

4. It then assigns a grade based on the following scale:
   - A+ for an average of 90 and above
   - A for an average between 80 and 89
   - B+ for an average between 70 and 79
   - B for an average between 60 and 69
   - C+ for an average between 50 and 59
   - C for an average between 45 and 49
   - Fail for an average below 45

### Running the Program:

To use the program, execute the `grades` class. The program will guide you through entering marks and then display the calculated grade.

Use this program to quickly assess and grade student performance!🎓📊

# Project Description: Number Game in Java

This Java project, named `numgame`, is an interactive number guessing game where the player attempts to guess a randomly selected number between 100 and 1000. The game provides the player with a limited number of trials (7 in this case) to guess the correct number.

### Features:

- **Random Number Generation:** The program generates a random number between 100 and 1000, which the player has to guess.

- **User Interaction:** The player interacts with the program by inputting their guesses using the console.

- **Trial Limit:** The game has a set number of trials (7 in this implementation), and the player must guess the correct number within these trials.

- **Feedback Mechanism:** After each guess, the program provides feedback to the player, indicating whether the guess is correct, out of range, too small, or too large.

### How to Play:

1. The game starts by informing the player that a number has been selected between 100 and 1000.

2. The player is prompted to guess the number within a specified number of trials.

3. The player inputs their guess, and the program provides feedback based on the comparison of the guess with the randomly generated number.

4. The game continues until the player correctly guesses the number, runs out of trials, or decides to exit.

### Running the Game:

To play the game, execute the `numgame` class. The program will guide you through the guessing process, providing feedback and announcing the outcome at the end of the game.

Enjoy the challenge of guessing the right number!🔢🎮
