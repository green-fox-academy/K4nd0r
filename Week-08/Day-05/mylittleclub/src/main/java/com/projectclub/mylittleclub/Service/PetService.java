package com.projectclub.mylittleclub.Service;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {
  List<Pet> pets;
  public PetService() {
    pets = new ArrayList<>();
  }
  public void addPet(Pet pet) {
    pets.add(pet);
  }
  public Pet getPetByName(String name) {
    for (Pet pet : pets) {
      if (pet.getName().equals(name)) {
        return pet;
      }
    }
    return null;
  }
}

