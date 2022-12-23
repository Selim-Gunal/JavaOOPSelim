public class DogDriver {

    public static void main(String[] args) {
        //String color, double height, double weight, String kind
        Dog jack = new Dog("Green", 10.829,12.3, "Puppy" );
        double initialWeight= jack.getWeight();
        //System.out.println(jack); //Dog@36baf30c where the object allocated in the memory
        //System.out.println("Because of Kerem color changed");
        jack.setColor("Black");
        //System.out.println(jack);
        jack.setHeight(100);
        //System.out.println(jack);
        jack.setWeight(200);
        //System.out.println(jack);
        jack.setKind("Pitbull");

        double finalWeight= jack.getWeight();

        double weightDifference = finalWeight- initialWeight;

        System.out.println("Weight difference of Jack is: " + weightDifference);
    }
}
