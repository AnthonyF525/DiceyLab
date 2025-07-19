public class Simulation {

    public static void main(String[] args) {
        int numberOfDice = 2; // Number of dice to simulate
        int tosses = 1000000; // Number of tosses to simulate
        Bins bins = runSimulation(numberOfDice, tosses);
        printResult(bins, tosses); // Print the results of the simulation

    }


    public static Bins runSimulation(int numberOfDice, int tosses) { // Method to run the simulation
        Dice dice = new Dice(numberOfDice); // Create a Dice object with the specified number of dice
        Bins bins = new Bins(numberOfDice, numberOfDice * 6); // Create a Bins object to hold the results


        for (int i = 0; i < tosses; i++) { // Loop through the number of tosses
            int result = dice.tossAndSum(); // Roll the dice and get the sum
            bins.incrementBin(result); // Increment the bin for the result
        }

        return bins;
    }

    public static void printResult(Bins bins, int tosses) {
        System.out.println("Results:");
        for (int i = bins.getIndex(bins.getMinValue()); i <= bins.getIndex(bins.getMaxValue()); i++) {
            int value = bins.getMinValue() + i;
            int count = bins.getBin(value);
            double percentage = (count * 100.0) / tosses; 
            String stars = new String(new char[(int) percentage]).replace('\0', '*'); 
            System.out.printf("%2d :%7d : %5.2f%% %s\n", value, count, percentage, stars);
        }
    }

}




