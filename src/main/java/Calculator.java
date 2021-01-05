public class Calculator {
    private double input1;
    private double input2;

    public Calculator(double input1, double input2){
        this.input1 = input1;
        this.input2 = input2;
    }

    public int addNumbers() {
        return (int) (input1 + input2);
    }

    public int subtractNumbers() {
        return (int) (input1 - input2);
    }

    public int multiplyNumbers() {
        return (int) (input1 * input2);
    }

    public double divideNumbers() {
        return (input1 / input2);
    }
}
