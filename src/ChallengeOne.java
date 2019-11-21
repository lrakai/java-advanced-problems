public class ChallengeOne {
    public static String[] fruitColors(Fruit[] fruits) {
        /**
         * Return an array of the colors of each Fruit in the fruits array
         * Arguments
         * fruits - array of Fruit
         * Examples
         * Fruit[] fruits = new Fruit[2];
         * fruits[0] = new Banana();
         * fruits[1] = new Orange();
         * String[] colors = fruitColors(fruits); // Outputs {"Yellow", "Orange"}
        */

        // ====================================
        // Do not change the code before this
    
        // CODE1: Write code that will return an array of the colors 
        //        of each Fruit in the fruits array
        
    
        // ====================================
        // Do not change the code after this
    }

    public static void main(final String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Banana();
        fruits[1] = new Orange();
        String[] colors = fruitColors(fruits);
        // Expected output is 
        // Yellow
        // Orange
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(colors[i]);
        }
    }
}

abstract class Fruit {
    protected String color;

    public Fruit(String theColor)
    {
        color = theColor;
    }

    public String getColor()
    {
        return color;
    }
}

// ====================================
// Do not change the code before this

// CODE2: Complete implementations of classes Banana and Orange
//        that are subclasses of Fruit. Banana has "Yellow" color and
//        Orange has "Orange" color.

class Banana ___ {

}

class Orange ___ {

}

// ====================================
// Do not change the code after this