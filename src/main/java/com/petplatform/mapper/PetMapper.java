package com.petplatform.mapper;

import com.petplatform.POJO.Pet;

import java.util.List;

public interface PetMapper {
    List<Pet> selectPets();
    Pet selectByPetNumber(Pet pet);
    void insertPet(Pet pet);
    void updatePet(Pet pet);
    void deletePet(Pet pet);
}
