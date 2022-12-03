package com.company;

public class human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;


    human (String name,String town,int yearOfBirth,String jobTitle) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;

    }


    void human (){
        System.out.println(name + " из города " + town + ",который родился в " + yearOfBirth);
    }


    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году." + "Я работаю на должности " + jobTitle + "Будем знакомы!";
    }
}
