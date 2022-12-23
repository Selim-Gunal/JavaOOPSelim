public class Bits {     //Driver Class

    public static void main(String[] args) {

        var bit1 = new BitValue();  // instantiates
        BitValue bit2 = new BitValue();  // instantiates
        BitValue bit3 = new BitValue();  // instantiates

        System.out.println("Initial Value: " + bit1);
        System.out.println("Initial Value: " + bit2);
        System.out.println("Initial Value: " + bit3);

        //bit1.setValue(true);
        bit3.setValue(true);
        boolean myNew = false;
        System.out.println(bit1.calculate(myNew));


        System.out.println("Final Value: " + bit1);
        System.out.println("Final Value: " + bit2);
        System.out.println("Final Value: " + bit3);

    }
}