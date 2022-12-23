public class NumberOfGoals {    // The class that defines methods
    private int currentGoal;    // variable shows current value of goals in match at the moment

    public NumberOfGoals() {    // Constructor must have same with Class
        currentGoal = 3;
    }

    public void ucluk(){
        currentGoal = currentGoal + 3 ;
    }

    public void Goal(){
        currentGoal++;
    }
    public void setGoal(int goal){   //this. or valiable always on the left side
        currentGoal = goal;
    }

    public void pankart() {
       int random = (int) (Math.random() * 7 + 1 ); //for 7--> 0 6

        switch (random)
        {
            case (1):
                System.out.println("Lorem Ipsum");
                break;
            case (2):
                System.out.println("Fener evine git");
                break;
            case (3):
                System.out.println("Galatasaray evine git");
                break;
            case (4):
                System.out.println("Selim sacmaladi");
                break;
            case (5):
                System.out.println("CIMBOM SANA BURDAN EKMEK YOK");
                break;
            case (6):
                System.out.println("Fener cakiyor");
                break;
            case (7):
                System.out.println("Fener evini aydinlat");
                break;
        }
    }

    public String toString() {
        String result = Integer.toString(currentGoal);
        return result;
    }
}
