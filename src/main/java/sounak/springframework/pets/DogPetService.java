package sounak.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by sounak on 25-06-2024.
 */
@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
