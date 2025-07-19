import java.util.HashMap;

public class Bins {

    private int[] bins; 
    private int minValue;
    private int maxValue; 

    public HashMap<Integer, Integer> toMap() {
        HashMap<Integer, Integer> map = new HashMap<>(); // create a HashMap to store the bins
        for (int i =0; i < bins.length; i++) {
            int value = minValue + i;
            map.put(value, bins[i]);
        }
        return map;
    }

    public Bins(int minValue, int maxValue) { // constructor to initialize the bins
        this.minValue = minValue; // set the minimum value
        this.maxValue = maxValue;// set the maximum value
        bins = new int[maxValue - minValue +1]; // create an array of bins with size equal to the range of values
    }

    public void incrementBin(int value) { // method to increment the bin for a given value
        int index = value - minValue; // calculate the index in the bins array
        bins[index]++; //Increments the bin by 1
    }

    public int getBin(int value) { // method to get the count of a specific bi
        int index = value - minValue; // calculate the index in the bins array
        return bins[index]; // return the count of the bin
    }

    public String toString() { // method to return a string representation of the bins
        StringBuilder sb = new StringBuilder(); // StringBuilder to build the output string
        for (int i = 0; i < bins.length; i++) { // loop through the bins array
            int value = minValue + i; // calculate the value corresponding to the bin index
            int count = bins[i]; // get the count of the bin
            sb.append(value + ":" + count + "\n"); // append the value and count to the StringBuilder
        }
        return sb.toString();
    }

    public int getIndex(int value) { // method to get the index of a value in the bins array
        return value - minValue;
        
    }

    public int getMinValue() { 
        return minValue; // return the minimum value
    }

    public int getMaxValue() {
        return maxValue;
    }
}
