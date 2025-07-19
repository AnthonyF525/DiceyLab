public class Dice {
    
    private int numberOfDice; // number of dice to roll
        
    public Dice(int numberOfDice) { // constructor to initialize the number of dice
        this.numberOfDice = numberOfDice; // set the number of dice
    }

    public int tossAndSum() { // method to roll the dice and return the sum
        int sum = 0; // initialize sum to 0
        for (int i = 0; i < numberOfDice; i++) { // loop through the number of dice
            sum += rollSingleDie(); // roll each die and add to sum
        }
        return sum;
    }

    private int rollSingleDie() { // method for rolling a single die
        return 1 + (int)(Math.random() * 6); // return a random number between 1 and 6

        }
        

        
}


