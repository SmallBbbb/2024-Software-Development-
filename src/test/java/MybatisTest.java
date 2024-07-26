

import java.io.IOException;
import java.util.List;

import com.petplatform.POJO.Adoption;
import com.petplatform.POJO.Pet;
import com.petplatform.POJO.User;
import com.petplatform.dao.AdoptionDao;
import com.petplatform.dao.UserDao;
import org.junit.jupiter.api.Test;

public class MybatisTest {
    @Test
    public void testSelectUser() throws IOException {
        List<User> users = UserDao.selectUsers();
        System.out.println(users);
    }
    @Test
    public void testUserSelectById(){
        User user = UserDao.selectUserById("111111111111111111");
        System.out.println(user);
    }
    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUserIdNumber("123123123412341234");
        user.setUserUsername("test2");
        user.setUserPassword("123456");
        user.setUserEmail("test@test.com");
        user.setUserVolunteerQualification(false);
        UserDao.insertUser(user);
    }
    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setUserIdNumber("123123123412341234");
        user.setUserUsername("test2");
        user.setUserPassword("123456");
        user.setUserEmail("test@test3.com");
        user.setUserVolunteerQualification(false);
        UserDao.updateUser(user);
    }
    @Test
    public void testDeleteUser(){
        User user = new User();
        user.setUserIdNumber("123123123412341234");
        UserDao.deleteUser(user);
    }
    @Test
    public void testRejectAdoption(){
        Adoption adoption = new Adoption();
        adoption.setAdoptionNumber(3);
        AdoptionDao.rejectAdoption(adoption);
    }
    @Test
    public void testPassAdoption(){
        Adoption adoption = new Adoption();
        adoption.setAdoptionNumber(3);
        AdoptionDao.passAdoption(adoption);
    }
    @Test
    public void testDeleteAdoptionByPetNumber(){
        Pet pet = new Pet();
        pet.setPetNumber(14);
        AdoptionDao.deleteAdoptionByPetNumber(pet);
    }
}
