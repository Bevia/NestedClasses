/**
 * Created by vincent on 1/3/16.
 */
public class AnonymousInnerClass {

    static StaticNestedClass.Color getColorDetails(final StaticNestedClass.Color color) {
        //Notice the final declaration! if it is not final the local inner class below would not be able to use it below!
        //You can only pass final variables to Anonymous Inner Classes!

        //notice also that there is no name for the class! It is created on the fly in the return statement!
        return new StaticNestedClass.Color() {

            public String toString() {
                System.out.println("\n" + "Anonymous Inner Class output --->");
                return "the details of the color are here," + color;
            }

        };
    }
}
