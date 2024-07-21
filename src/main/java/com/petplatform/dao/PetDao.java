package com.petplatform.dao;

import com.petplatform.POJO.Pet;
import com.petplatform.mapper.PetMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PetDao {

    private static final PetMapper petMapper;
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        petMapper = sqlSession.getMapper(PetMapper.class);
    }

    public List<Pet> selectPets() {
        return petMapper.selectPets();
    }
    public Pet selectByPetNumber(Pet pet) {
        return petMapper.selectByPetNumber(pet);
    }
    public void insertPet(Pet pet) {
        petMapper.insertPet(pet);
    }
    public void updatePet(Pet pet) {
        petMapper.updatePet(pet);
    }
    public void deletePet(Pet pet) {
        petMapper.deletePet(pet);
    }
}
