package sounak.springframework.pets;

/**
 * Created by sounak on 25-06-2024.
 */
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
