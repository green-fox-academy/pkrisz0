public class Sharpie {
    String color;
    float width;
    float inkAmount;



    public Sharpie (String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100f;
    }

    public void use() {
        this.inkAmount -= width;
    }



    public static void main(String[] args) {
        Sharpie blue = new Sharpie("blue",3.5f);
        Sharpie red = new Sharpie("pink", 6.9f);

        blue.use();
        System.out.println("Remining " + blue.color + " : "+ blue.inkAmount);
        red.use();
        System.out.println("Remining " + red.color + " : "+ red.inkAmount);
    }



}