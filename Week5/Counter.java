package Week5;

public class Counter {
    int startingValue;
    boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }
    public Counter(int startingValue) {
        this.startingValue = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.startingValue = 0;
        this.check = check;
    }

    public Counter() {
        this.startingValue = 0;
        this.check = false;
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        startingValue++;
    }

    public void increase(int increaseAmount) {
        if ( increaseAmount < 0 ) {
            startingValue = this.startingValue;
        } else {
            startingValue = this.startingValue + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            startingValue = this.startingValue;
        }
        if (check) {
            for (int i = 0; i < decreaseAmount; i++) {
                startingValue--;
                if (startingValue == 0) {
                    break;
                }
            }
        }
    }

    public void decrease() {
        if (!check) {
            startingValue--;
        }
        if ( check && startingValue != 0 ) {
            startingValue--;
        }
    }
}