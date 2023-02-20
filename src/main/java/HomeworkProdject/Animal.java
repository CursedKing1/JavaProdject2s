package HomeworkProdject;

public class Animal {
    private int speed;
    private int weight;
    private String breed;
    private String fur;

    public String isFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid data");
        }
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid data");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;

    }

    public void printDogData() {
        System.out.printf(("\n") + ("This dog speed is: %d.%n This dog weight" +
                "is: %d.%n This dog Breed is: %s.%n"), speed, weight, breed);

    }
    public void animalSound() {
        System.out.println("This animal makes sound");
    }
    }

