public class Circle {

    private double radius;
    private double p = Math.PI;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double myDouble){
        radius = myDouble;
        //this.radius = radius;
    }

    public double circumference (){
        double myCircumference = 2*p*radius;
        return myCircumference;
    }

    public double area(){
        double myArea = radius*radius*p;
        return myArea;
    }

    @Override
    public String toString() {
        String result = "Radius: " + radius + ", Area: " + area() + ", Circumference: " + circumference();
        return result;
    }

    public Circle() {
        radius = 3.5;
    }
}
