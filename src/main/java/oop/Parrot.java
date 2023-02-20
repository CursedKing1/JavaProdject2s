package oop;

public class Parrot extends Pet {


    public void talk() {

        System.out.println("I can talk ");
    }

    // Here we need to set the breed again
    public boolean isExpensive(Breed breed) {
        if (breed.getBreedName().equals("Cocoduluty")) {
            return true;
        } else {
            return false;

      /*  boolean result = false;
        switch (breed.getBreedName()){
            case "Cocoduluty":
                result = true;
                break;
            case "Mini":
                result = false;
                break;
            default:
                result = false;
        }
        return result;
   }


            // method overload
            public boolean isExpensive() {
                if (super.getBreed().getBreedName().equals("Cocoduluty")) {
                    return true;
                } else {
                    return false;
                }
            }*/
        }
    }
}