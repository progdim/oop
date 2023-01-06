package animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {

    public static class Breed {

        private String breedName;
        private String country;
        private String hairType;


        public Breed(String breedName, String country, String hairType) {
            this.breedName = breedName;
            this.country = country;
            this.hairType = hairType;
        }

        public String getBreedName() {
            return breedName;
        }

        public void setBreedName(String breedName) {
            this.breedName = breedName;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getHairType() {
            return hairType;
        }

        public void setHairType(String hairType) {
            this.hairType = hairType;
        }
    }


    private String name;
    private int birthYear;
    private Cat[] friends;
    private Breed breed;

    public Cat(String name){
        this(name, 0);
    }


    public void setBreed(Breed breed) {
        if (breed == null) {
            this.breed = breed;
            }
        }

    public Cat(String name, int age){
        this.name = name;

        if (age>=0){
            this.birthYear = LocalDate.now().getYear() - age;
        }else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }

        friends = new Cat[0];
    }



    void meow(){
        System.out.println("Мяу мяу ");
        System.out.println("Меня зовут " + name);
        System.out.println("Мне " + getAge() + " лет");
    }




    Cat[] getFriends(){
        if (friends ==null){
            friends = new Cat[0];
        }
        return friends;
    }




    void addFriend(Cat friend){
        this.friends = Arrays.copyOf(getFriends(),getFriends().length+1);
        this.friends[this.friends.length-1] = friend;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Кот";
        }
    }




    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }


    public Breed getBreed() {
        return breed;
    }


}
