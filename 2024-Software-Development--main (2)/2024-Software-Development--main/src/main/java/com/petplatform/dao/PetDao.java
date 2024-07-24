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

// 定义一个名为PetDao的类，用于处理与Pet对象相关的数据库操作
public class PetDao {

    // 定义一个静态常量petMapper，用于存储PetMapper接口的实例
    // PetMapper是一个MyBatis的Mapper接口，用于定义与Pet相关的数据库操作
    private static final PetMapper petMapper;

    // 静态初始化块，用于在类加载时初始化petMapper
    static {
        // 指定MyBatis配置文件的路径
        String resource = "mybatis-config.xml";
        // 声明一个InputStream变量，用于读取配置文件
        InputStream inputStream = null;
        try {
            // 使用MyBatis提供的Resources工具类加载配置文件
            inputStream = Resources.getResourceAsStream(resource);
            // 如果配置文件不存在或读取出错，将抛出IOException
        } catch (IOException e) {
            // 将IOException转换为RuntimeException抛出，以便上层代码能够捕获并处理
            throw new RuntimeException("无法加载MyBatis配置文件", e);
        }
        // 使用SqlSessionFactoryBuilder构建SqlSessionFactory实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 打开一个SqlSession，并设置自动提交为true（这里可能需要根据实际情况调整）
        // 注意：通常不建议在静态初始化块中打开SqlSession，因为这会导致SqlSession的生命周期与类相同
        // 但在这个例子中，为了简化代码，我们这样做了，并假设MyBatis配置和连接池已正确设置
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 通过SqlSession获取PetMapper的实例
        petMapper = sqlSession.getMapper(PetMapper.class);
        // 注意：这里的SqlSession并没有显式关闭，因为SqlSessionFactory可能配置了连接池
        // 但在实际应用中，应避免在静态上下文中管理SqlSession
    }

    // 定义一个方法，用于查询所有Pet对象
    public List<Pet> selectPets() {
        // 调用petMapper中的selectPets方法，并返回查询结果
        return petMapper.selectPets();
    }

    // 定义一个方法，根据宠物编号查询Pet对象
    // 注意：这里的方法设计可能不是最优的，因为通常我们会根据宠物编号（如String或Integer）查询，而不是Pet对象
    // 假设Pet类中有一个属性用于存储宠物编号，并且Mapper接口中有相应的方法
    public Pet selectByPetNumber(Pet pet) {
        // 调用petMapper中的selectByPetNumber方法，传入Pet对象（这里假设该对象包含要查询的编号）
        // 实际上，更好的做法是直接传递编号作为参数
        return petMapper.selectByPetNumber(pet);
    }

    // 定义一个方法，用于插入新的Pet对象到数据库
    public void insertPet(Pet pet) {
        // 调用petMapper中的insertPet方法，传入要插入的Pet对象
        petMapper.insertPet(pet);
    }

    // 定义一个方法，用于更新已存在的Pet对象
    public void updatePet(Pet pet) {
        // 调用petMapper中的updatePet方法，传入要更新的Pet对象
        petMapper.updatePet(pet);
    }

    // 定义一个方法，用于从数据库中删除Pet对象
    public void deletePet(Pet pet) {
        // 调用petMapper中的deletePet方法，传入要删除的Pet对象
        // 类似于selectByPetNumber，这里也可能存在设计上的改进空间
        petMapper.deletePet(pet);
    }
}
