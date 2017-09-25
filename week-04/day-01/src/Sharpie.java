public class Sharpie {
    String color;
    float width;
    float inkAmount = 100f;



    public static void main(String[] args) {
        Sharpie blue = new Sharpie("blue",3.5f);
        Sharpie red = new Sharpie("pink", 6.9f);

        blue.use();
        System.out.println("Remining " + blue.color + " : "+ blue.inkAmount);
        red.use();
        System.out.println("Remining " + red.color + " : "+ red.inkAmount);
    }


    public void use() {
        this.inkAmount -= width;
    }

    public Sharpie (String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }
}

/*
Create Sharpie class
We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount
*/