package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;
import generic.animal.Pig;

/**
 * 2026년 7월 10일
 * 제네릭
 */
public class AnimalMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);
        Pig pig = new Pig("돼지", 100);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog); // Animal = Dog
        animalBox.set(cat); // Animal = Cat
        animalBox.set(pig);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

    }
}