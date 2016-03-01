/**
 * Created by vincent on 1/3/16.
 */
public class LocalInnerClass {

    //Unlike Inner Classes and Static Nested Classes, Inner Classes are NOT members of the Outer Class! They
    //are just local to the method or block of code which defines them!

    static StaticNestedClass.Color getColorDetails(final StaticNestedClass.Color color){
        //Notice the final declaration! if it is not final the local inner class below would not be able to use it below!
        //You can only pass final variables to Local Inner Classes!

        class ColorDetails extends StaticNestedClass.Color {

            public String toString ()
            {
                System.out.println("\n" + "Local Inner Class output --->");
                return "the details of the color are here," +  color;
            }
        }
        return new ColorDetails();
    }
}
