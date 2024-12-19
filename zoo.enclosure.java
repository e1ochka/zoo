package zoo.enclosure;

//Класс для вольера
class Enclosure {
    String type;
    zoo.animals.Animal[] animals;

    public Enclosure(String type, int capacity){
        this.type = type;
        this.animals = new zoo.animals.Animal[capacity];
    }
    public void addAnimal(zoo.animals.Animal animal, int index){
        this.animals[index] = animal;
    }
}
