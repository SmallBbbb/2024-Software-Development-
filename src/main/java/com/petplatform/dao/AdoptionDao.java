package com.petplatform.dao;

import com.petplatform.POJO.Adoption;
import com.petplatform.POJO.Pet;
import com.petplatform.POJO.User;
import com.petplatform.mapper.AdoptionMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

// AdoptionDao 类，用于处理与收养（Adoption）相关的数据库操作
public class AdoptionDao {
    private static final AdoptionMapper adoptionMapper;

    static {

        String resource = "mybatis-config.xml";

        InputStream inputStream = null;
        try {

            inputStream = Resources.getResourceAsStream(resource);

        } catch (IOException e) {

            throw new RuntimeException("无法加载MyBatis配置文件", e);
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);

    }

    // 查询所有收养记录
    public static List<Adoption> selectAdoptions() {
        return adoptionMapper.selectAdoptions(); // 假设这是AdoptionMapper中的方法名
    }

    // 根据收养编号查询收养记录
    public static Adoption selectAdoptionByNumber(Adoption adoption) {
        // 这里假设 Adoption 对象中包含用于查询的编号
        return adoptionMapper.selectAdoptionByNumber(adoption); // 假设采用某个ID作为查询条件
        // 注意：这里假设了一个getId()方法，实际应根据实际情况调用
    }

    // 根据收养者编号查询收养记录
    public static List<Adoption> selectAdoptionsByAdopterNumber(User user) {
        // 这里假设 User 对象中包含用于查询的收养者编号
        return adoptionMapper.selectAdoptionByAdopterNumber(user); // 假设的方法名和字段
        // 注意：这里假设了一个getAdopterNumber()方法，且方法名反映了是查询多个收养记录
    }

    public static void insertAdoption(Adoption adoption) {
        adoptionMapper.insertAdoption(adoption);
    }

    public static void updateAdoption(Adoption adoption) {
        adoptionMapper.updateAdoption(adoption);
    }

    public static void deleteAdoption(Adoption adoption) {
        adoptionMapper.deleteAdoption(adoption);
    }

    public static void deleteAdoptionByPetNumber(Pet pet) {
        adoptionMapper.deleteAdoptionByPetNumber(pet);
    }

    public static void rejectAdoption(Adoption adoption) {
        adoptionMapper.rejectAdoption(adoption);
    }

    public static void passAdoption(Adoption adoption) {
        adoptionMapper.passAdoption(adoption);
    }
}
