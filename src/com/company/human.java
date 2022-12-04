package com.company;

public class human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public human(String name,String town,int yearOfBirth,  String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }


    //
//        this.name = name;
//        if (this.name == null){
//            this.name = "Информация не указана";
//        }
//
//
//        this.town = town;
//        if (this.town == null){
//            this.town = "Информация не указана";
//        }
//
//
//        this.yearOfBirth = yearOfBirth;
//        if (yearOfBirth >= 0) {
//        } else {
//            this.yearOfBirth = 0;
//        }
//        this.jobTitle = jobTitle;
//



        void human () {
            System.out.println(name + " из города " + town + ",который родился в " + yearOfBirth);
        }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году." + "Я работаю на должности " + jobTitle + "Будем знакомы!";
    }
}

