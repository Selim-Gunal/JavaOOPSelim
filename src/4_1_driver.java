public class GoalsDriver {

    public static void main(String[] args) {    // Driver

        NumberOfGoals galatasarayGolleri, fenerGolleri;

        galatasarayGolleri = new NumberOfGoals();  //galatasarayGolleri is new object of NumberOfGoals class
        fenerGolleri = new NumberOfGoals();

        fenerGolleri.setGoal(1);

        System.out.println("Galatasaray Ilk Skor: " + galatasarayGolleri);
        System.out.println("Fener ilk Skor: " + fenerGolleri);


        System.out.println("Galatasaray Sacmaladi");
        System.out.println("Fener yardirdi");
        fenerGolleri.ucluk();
        fenerGolleri.ucluk();


        System.out.println("Galatasaray Son Skor: " + galatasarayGolleri);
        System.out.println("Fener Son Skor: " + fenerGolleri);

        fenerGolleri.pankart();
        //galatasarayGolleri.pankart();
    }
}