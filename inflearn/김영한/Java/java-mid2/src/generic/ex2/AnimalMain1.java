package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;
import generic.animal.Pig;

/**
 * 2026년 7월 10일
 * 제네릭
 */
public class AnimalMain1 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

        Pig pig = new Pig("저팔계", 20);

        Box<Pig> pigBox = new Box<>();
        pigBox.set(pig);
        System.out.println("pigBox.get() = " + pigBox.get());
    }
}