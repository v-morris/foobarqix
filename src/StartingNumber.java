public class StartingNumber {

    private int startingNumber;

    public StartingNumber(int startingNumber) {
        this.startingNumber = startingNumber;
    }

    public boolean isDivisibleBy(int i) {
        return this.startingNumber % i == 0;
    }

}