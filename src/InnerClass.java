/**
 * Created by vincent on 1/3/16.
 */

//Outer Class name: InnerClass
public class InnerClass {

    private int red;
    private int blue;
    private int green;

    private Color myColor;
    private String saturation = "Low Contrast of Saturation";

    public InnerClass() {
        this(0, 0, 0, "Defaul Value");
    }

    //new color:
    public InnerClass(int red, int blue, int green, String saturation) {

        this.red = red;
        this.blue = blue;
        this.green = green;
        this.saturation = saturation;

        //you can't access member variables from inner class!
        //System.out.println("String value from inner class:  " + innerClassString); //Won't work!

        myColor = this.new Color(this.red, this.blue, this.green);
        System.out.println("my new color has the following values:  " + myColor);

    }

    //now lets override the toString method:
    public String toString() {

        return "I got a new color with " + this.saturation + " Contrast";
    }

    //And here is our inner class:
    //Remember that the visibility of the inner class is defined by the outer class!
    //an Inner Class can be defined as final or abstract, but if you declare it abstract, you cannot instantiate it!
    //So lets now define Color as an inner class within the InnerClass like this:
    class Color {

        private int red;
        private int blue;
        private int green;
        String innerClassString = "inner class";

        //we are going to provide a no argument constructor for the inner class:
        public Color() {
            this(0, 0, 0);
        }

        //we are going to overload the constructor for the inner class:
        public Color(int red, int blue, int green) {
            this.red = red;
            this.blue = blue;
            this.green = green;

            //accessing private field from outer class...
            System.out.println("accessing my saturation value: " + saturation);
        }

        //now lets override the toString method:
        public String toString() {
            return " red: " + this.red + " blue: " + this.blue + " and green: " + this.green;
        }
    }
}
