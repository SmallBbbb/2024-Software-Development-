import com.softwaredevelopment.petplatform.POJO.User;
import com.softwaredevelopment.petplatform.dao.UserDao;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class TestUser {
    @Test
    public void test() throws SQLException {
        User u = new User();
        u.setAccountNumber(31);
        u.setUsername("test2111");
        u.setPassword("testtest2111");
        UserDao.insertUser(u);
        //UserDao.deleteUser(u);
        //UserDao.updateUser(u);
        //UserDao.getUserByAccountNumber(3);
    }
}

