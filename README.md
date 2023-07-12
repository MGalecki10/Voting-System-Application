# Voting System Application

This is a simple Java program that allows users to conduct a voting process and obtain the voting results.

## Prerequisites
* Java Development Kit (JDK) installed on your system.
* A Java IDE or text editor to run the program.

## Usage
1. Open the Java file **'Voting.java'** in your preferred Java IDE or text editor.
2. Compile and run the **'Voting'** class to start the voting process.
3. Enter the vote for each voter when prompted:
* Enter 'z' for "za" (in favor).
* Enter 'p' for "przeciw" (against).
* Enter 'w' for "wstrzymanie się" (abstain).
4. After all votes are cast, the program will display the voting results, showing the percentage of votes for, against, and abstentions.
  
## Code Explanation

The program consists of three classes:

1. **Vote**: Represents an individual vote, containing the name of the voter and their vote (in favor, against, or abstention).
2. **Voting**: Handles the voting process, collects votes from voters, and calculates the voting results.
3. **VotingResult**: Stores and manages the voting results, including vote counts and printing the results.

The **'Voting'** class contains the **'main'** method, which serves as the entry point for the program. It initializes a list of voters, creates an instance of **'Voting'**, and executes the voting process by calling the **'executeVoting'** method.

The **'executeVoting'** method in the **'Voting'** class iterates over the list of voters, prompts each voter to enter their vote, and stores the vote using the **'addVote'** method of the **'VotingResult'** class.

The **'getVoteForVoter'** method in the **'Voting'** class prompts the voter for their vote choice and validates the input. It returns the vote as a Boolean value (**'true'** for in favor, **'false'** for against, and **'null'** for abstention).

The **'VotingResult'** class maintains a **'voteMap'** which stores the votes mapped to the voter's name. It provides methods to calculate and print the voting results, as well as printing the individual vote of a specific voter.

## Example Output
```
Jak głosuje Jan Kowalski? (z - za, p - przeciw, w - wstrzymanie się)
z
Jak głosuje Dominik Stankiewicz? (z - za, p - przeciw, w - wstrzymanie się)
p
Jak głosuje Dariusz Nowak? (z - za, p - przeciw, w - wstrzymanie się)
w

Głosów za: 33.33%
Głosów przeciw: 33.33%
Wstrzymało się: 33.33%

Jan Kowalski: ZA
Dominik Stankiewicz: PRZECIW
Dariusz Nowak: WSTRZYMAŁ SIĘ
```

**Note:** This is a basic implementation and may not cover all possible scenarios or error handling. It serves as a starting point for understanding and building more complex voting systems.
