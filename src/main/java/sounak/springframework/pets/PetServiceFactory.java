package sounak.springframework.pets;

/**
 * Created by sounak on 03-07-2024.
 */
public class PetServiceFactory {

    public PetService getPetService(String petType) {
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
