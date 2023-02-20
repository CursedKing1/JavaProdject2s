package HomeworkProdject;

public class procedure {

    public static void main (String[] args){
        Dog pB = new Dog();
        pB.setSpeed(33);
        pB.setWeight(8);
        pB.setBreed("Pitbull");
        pB.setFur("True");
        pB.animalSound();
        pB.printDogData();

        Cat ct = new Cat();
        ct.setSpeed(28);
        ct.setWeight(3);
        ct.setFur("False");
        ct.setBreed("Svinks");
        ct.animalSound();
        ct.printDogData();

    }
}
