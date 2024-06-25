package sounak.springframework.di.controllers;

import org.springframework.stereotype.Controller;
import sounak.springframework.di.services.PetService;

/**
 * Created by sounak on 25-06-2024.
 */
@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }

}
