/**
 * Created by vincent on 1/3/16.
 */

//Outer Class name: StaticNestedClass
abstract class StaticNestedClass {

    int m = 10;  //this field cannot be called from within the static inner class!!  but....
    static int n = 10; //this field can...because static nested classes can only access static field members of the outer class!!

    //Lets create now the Static Nested Class:
    public static class Color {

        int red;
        int blue;
        int green;

        //no arguments constructor
        public Color(){
            this (0,0,0);
            System.out.println("calling the no argument constructor ");
        }

        //Overloaded constructor
        public Color (int red, int blue, int green){
            this.red = red;
            this.blue = blue;
            this.green = green;

            System.out.println("calling the overloaded Color constructor " + n); //if you change n for m, you will get an error!
        }

        /**
         The toString() method returns a textual representation of an object.
         Overriding the method is always a good idea!
         */

        @Override
        public String toString(){
            return " red: " + this.red + " blue: " + this.blue + " and green: " + this.green;
        }

    }
}
