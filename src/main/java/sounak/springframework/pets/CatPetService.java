package sounak.springframework.pets;

/**
 * Created by sounak on 25-06-2024.
 */
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
