package com.company;


import animals.Cat;

public class Main {

    public static void main(String[] args) {

        Cat.Breed brShBreed = new Cat.Breed("Breitish","USA","short");

        Cat murzik = new Cat("Мурзик");
        murzik.setBreed(brShBreed);
//        murzik.age = 3;
//        murzik.meow();


//        Cat begemot = new Cat("Бегемот",-5);
////      begemot. = -5;
//        begemot.setName(null);
//        begemot.meow();

     //   System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");


        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");















//        human maksim = new human("Максим", "Минск", -789, "бренд-менеджером");
//        human ann = new human("Анна", "Москва", 1993, "методистом образовательных программ");
//        human Kate = new human("Катя", "", 1992, "продакт-менеджером");
//        human Artem = new human("Артем", "Москва", 1995, "директором по развитию бизнеса");
//
//        maksim.human();
//        ann.human();
//        Kate.human();
//        Artem.human();
//
//        System.out.println(maksim.toString());
//        System.out.println(ann.toString());
//        System.out.println(Kate.toString());
//        System.out.println(Artem.toString());
//
//
//
//        Care lada_Granta = new Care("Lada","Granta",1.7,"Желтого цвета",2015,"Россия");
//        System.out.println(lada_Granta.toString());
    }
}