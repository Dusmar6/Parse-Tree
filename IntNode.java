// Greyson Cabrera 014121118
// Dustin Martin 015180085

/**
 * Derived integer object
 */
public class IntNode extends Operator {

    private int number;// the represented value

    public IntNode(int number) {
        super("" + number);//configure string representation
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
