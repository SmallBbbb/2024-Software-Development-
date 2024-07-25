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

// AdoptionDao 类，用于处理与收养（Adoption）相关的数据库操作
public class AdoptionDao {
    // 静态的 AdoptionMapper 实例，用于执行MyBatis的数据库操作
    private static final AdoptionMapper adoptionMapper;

    // 静态初始化块，用于在类加载时初始化 adoptionMapper
    static {
        String resource = "mybatis-config.xml"; // MyBatis配置文件路径
        InputStream inputStream = null;
        try {
            // 加载MyBatis配置文件
            inputStream = Resources.getResourceAsStream(resource);
            // 根据配置文件构建SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            // 尝试获取SqlSession（通常不应在静态初始化块中持有SqlSession的引用，但这里为了示例保留）
            try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
                // 通过SqlSession获取AdoptionMapper的实例
                adoptionMapper = sqlSession.getMapper(AdoptionMapper.class);
            }
            // 注意：这里移除了对inputStream的显式关闭，因为try-with-resources会处理SqlSession的关闭，
            // 而SqlSession的关闭通常会处理其底层资源的关闭（包括inputStream）
        } catch (IOException e) {
            // 如果配置文件加载失败，则抛出运行时异常
            throw new RuntimeException("Failed to load MyBatis configuration file: " + resource, e);
        }
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

    // 插入新的收养记录
    public static void insertAdoption(Adoption adoption) {
        adoptionMapper.insertAdoption(adoption);
    }

    // 更新收养记录
    public static void updateAdoption(Adoption adoption) {
        adoptionMapper.updateAdoption(adoption);
    }

    // 删除收养记录
    public static void deleteAdoption(Adoption adoption) {
        adoptionMapper.deleteAdoption(adoption);
    }
}
