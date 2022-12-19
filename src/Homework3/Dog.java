package Homework3;

public class Dog {
    private int age;
    private DogBreed dogBreed;
    private int pawCount;
    private String name;

    Dog(){

    }

    Dog(int age, DogBreed dogBreed, int pawCount, String name) {
        this.age = age;
        this.dogBreed = dogBreed;
        this.pawCount = pawCount;
        this.name = name;
    }

    Dog(Dog dog) {
        this.age = dog.age;
        this.dogBreed = dog.dogBreed;
        this.pawCount = dog.pawCount;
        this.name = dog.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogBreed(DogBreed dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void setPawCount(int pawCount) {
        this.pawCount = pawCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public DogBreed getDogBreed() {
        return dogBreed;
    }

    public int getPawCount() {
        return pawCount;
    }

    public String getName() {
        return name;
    }

    public void bark(){
        System.out.println("WOOF!!!" );
    }


}
