package oop;

public class Breed {
    private String breedName;

    public String getBreedName() {
        return breedName;
    }

    public Breed(String breedName) {
        if (!breedName.isEmpty()) {
            this.breedName = breedName;
        } else {
            System.out.println("Invalid Data");
        }
    }
    public void setBreedName(String breedName) {
        setBreedName(breedName);


    }
}
