package zoo.animals;

// Интерфейс для животных, способных плавать
interface Swimable {
    void swim();
}

// Интерфейс для животных, способных летать
interface Flyable {
    void fly();
}

// Абстрактный класс для животных
abstract class Animal {
    String name;
    String species;
    int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract String makeSound(); // Абстрактный метод - каждый подкласс должен его реализовать
    public abstract String getDiet(); // Абстрактный метод
}

// Конкретный класс для млекопитающих
class Mammal extends Animal {
    String furColor;

    public Mammal(String name, String species, int age, String furColor) {
        super(name, species, age);
        this.furColor = furColor;
    }

    @Override
    public String makeSound() {
        return "Generic mammal sound";
    }

    @Override
    public String getDiet() {
        return "Omnivore"; // пример
    }

}

// Конкретный класс для птиц
class Bird extends Animal implements Flyable {
    String wingSpan;

    public Bird(String name, String species, int age, String wingSpan) {
        super(name, species, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public String makeSound() {
        return "Generic bird sound";
    }

    @Override
    public String getDiet() {
        return "Insectivore"; // пример
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying!");
    }
}

// Конкретный класс для рыб
class Fish extends Animal implements Swimable {
    String finType;

    public Fish(String name, String species, int age, String finType) {
        super(name, species, age);
        this.finType = finType;
    }

    @Override
    public String makeSound() {
        return "Blub blub";
    }

    @Override
    public String getDiet() {
        return "Piscivore"; // пример
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming!");
    }
}

// Пример конкретного млекопитающего
class Lion extends Mammal {
    public Lion(String name, int age, String furColor){
        super(name, "Lion", age, furColor);
    }
    @Override
    public String makeSound() {
        return "Roar!";
    }
    @Override
    public String getDiet(){
        return "Carnivore";
    }
}
