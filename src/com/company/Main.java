package com.company;

public class Main {

    public static void main(String[] args) {

//        Cat murzik = new Cat("Мурзик");
//        murzik.age = 3;
//        murzik.meow();
//
//
//        Cat begemot = new Cat("Бегемот",4);
//        begemot.meow();

        human maksim = new human("Максим", "Минск", -789, "бренд-менеджером");
        human ann = new human("Анна", "Москва", 1993, "методистом образовательных программ");
        human Kate = new human("Катя", "", 1992, "продакт-менеджером");
        human Artem = new human("Артем", "Москва", 1995, "директором по развитию бизнеса");

        maksim.human();
        ann.human();
        Kate.human();
        Artem.human();
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