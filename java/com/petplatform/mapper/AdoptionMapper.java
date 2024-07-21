package com.petplatform.mapper;

import com.petplatform.POJO.Adoption;
import com.petplatform.POJO.User;

import java.util.List;

public interface AdoptionMapper {
    List<Adoption> selectAdoptions();
    Adoption selectAdoptionByNumber(Adoption adoption);
    List<Adoption> selectAdoptionByAdopterNumber(User user);
    void insertAdoption(Adoption adoption);
    void updateAdoption(Adoption adoption);
    void deleteAdoption(Adoption adoption);
}
