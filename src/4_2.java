public class BitValue {

    private boolean myDigit;
   // private String Selim;

    public void setValue(boolean value){
        myDigit = value;
    }

    public boolean calculate(boolean myBoolean)
    {
        boolean mydegisken = !myDigit;
        return mydegisken;
    }

    public String toString() {
        String result = Boolean.toString(myDigit);
        return result;
    }
}