/**
 * Created by vincent on 1/3/16.
 */
public class MainNestedClasses {

    public static void main (String [] args){

        /**
         *              Testing Static Nested Class:
         */

        //StaticNestedClass.Color colorWhite = new StaticNestedClass.Color();
        StaticNestedClass.Color colorWhite = new StaticNestedClass.Color(255, 255, 255);

        /**
         All classes in java are subclasses of java.lang.Object!
         & whenever you the call the System.out.println() method to print an object,
         the toString() method of Object class gets called! (in this case, in the Static Nested Class!.
         */
        System.out.println("the color white has the following values: "+ colorWhite);


        /**
         *              Testing Inner Class:
         */

        //lets call the constructor with arguments from InnerClass...
        //System.out.println("from my Inner Class: "+  new InnerClass());
        //System.out.println("from my Inner Class: "+  new InnerClass(12,234,23,"High Saturation"));

        /**
         *              Testing Local Inner Class:
         */

        //StaticNestedClass.Color colorDetails = LocalInnerClass.getColorDetails(new StaticNestedClass.Color(20,0,124));
        //System.out.println(colorDetails);

        /**
         *              Testing Anonymous Inner Class:
         */

        //StaticNestedClass.Color colorDetails = AnonymousInnerClass.getColorDetails(new StaticNestedClass.Color(124,255,14));
        //System.out.println(colorDetails);

    }
}
