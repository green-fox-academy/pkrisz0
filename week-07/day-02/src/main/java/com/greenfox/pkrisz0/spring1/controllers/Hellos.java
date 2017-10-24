package com.greenfox.pkrisz0.spring1.controllers;

public class Hellos {

    String content;
    String col;

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] color = {"red", "green", "blue", "yellow"};


    public String getHello(){
        return hellos [(int) (Math.random() * hellos.length)];
    }

    public String getColor(){
        return color [(int) (Math.random() * color.length)];
    }

    public Hellos() {
        this.content = getHello();
        this.col = getColor();
    }
}
