package com.petplatform.dao;

import com.petplatform.POJO.Adoption;
import com.petplatform.POJO.User;
import com.petplatform.mapper.AdoptionMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AdaptionDao {
    private static final AdoptionMapper adoptionMapper;
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
        adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
    }

    public List<Adoption> selectAdaptions() {
        return adoptionMapper.selectAdoptions();
    }
    public Adoption selectAdaptionByNumber(Adoption adoption) {
        return adoptionMapper.selectAdoptionByNumber(adoption);
    }
    public List<Adoption> selectAdaptionByAdopterNumber(User user) {
        return adoptionMapper.selectAdoptionByAdopterNumber(user);
    }
    public void insertAdaption(Adoption adoption) {
        adoptionMapper.insertAdoption(adoption);
    }
    public void updateAdaption(Adoption adoption) {
        adoptionMapper.updateAdoption(adoption);
    }
    public void deleteAdaption(Adoption adoption) {
        adoptionMapper.deleteAdoption(adoption);
    }
}
