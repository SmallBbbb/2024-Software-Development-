package com.petplatform.mapper;

import com.petplatform.POJO.Adoption;
import com.petplatform.POJO.Pet;
import com.petplatform.POJO.User;

import java.util.List;
import java.util.Map;

public interface AdoptionMapper {
    List<Adoption> selectAdoptions();
    Adoption selectAdoptionByNumber(Adoption adoption);
    List<Adoption> selectAdoptionByAdopterNumber(User user);
    void insertAdoption(Adoption adoption);
    void updateAdoption(Adoption adoption);
    void deleteAdoption(Adoption adoption);
    void deleteAdoptionByPetNumber(Pet pet);
    void rejectAdoption(Adoption adoption);
    void passAdoption(Adoption adoption);
}
