package main.java;

public class Table {

    public static void main(String[] args) {

        PostIt one = new PostIt();
        one.backgroundColor = "Orange";
        one.text = "Idea 1";
        one.textcolor = "blue";

        PostIt two = new PostIt();
        two.backgroundColor = "Pink";
        two.text = "Awesome";
        two.textcolor = "black";

        PostIt three = new PostIt();
        three.backgroundColor = "Yellow";
        three.text = "Superb!";
        three.textcolor = "green";

        System.out.println(three.text);
    }
}

    /*
    Create a PostIt class that has
    a backgroundColor
    a text on it
    a textColor
    Create a few example post-it objects:
    an orange with blue text: "Idea 1"
    a pink with black text: "Awesome"
    a yellow with green text: "Superb!"
     */