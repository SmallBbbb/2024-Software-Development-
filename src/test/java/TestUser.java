import com.softwaredevelopment.petplatform.POJO.User;
import com.softwaredevelopment.petplatform.dao.UserDao;

import java.sql.SQLException;

public class TestUser {
    public static void main(String[] args) throws SQLException {
        User u = new User();
        //u.setAccountNumber(2);
        u.setUsername("test");
        u.setPassword("testtest");
        //UserDao.insertUser(u);
        //UserDao.deleteUser(u);
        //UserDao.updateUser(u);
        UserDao.getUserByAccountNumber(3);
    }
}
