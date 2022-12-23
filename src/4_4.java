public class Dog {

    // color, height, weight, kind

    //Attributes
    private String color;
    private double height;
    private double weight;
    private String kind;

    public Dog(String color, double height, double weight, String kind){
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.kind = kind;
    }

    @Override
    public String toString(){
        String result = "Color of the Dog: "+ color  + "\n" + "Height of the Dog: " + height + "\n"
                + "Weight of the Dog: " + weight  + "\n" + "Kind of the Dog: " + kind + "\n";
        return result;
    }

    public void setHeight(double value) //Try to write "int"
    {
        height = value;
    }

    public void setColor(String mycolor)
    {
        //this.color = color;
        color = mycolor;
    }

    public void setWeight(double myWeight)
    {
        weight = myWeight;
    }

    public void setKind(String myKind){
        kind = myKind;
    }

    public double getWeight(){
        return weight;
    }
}
