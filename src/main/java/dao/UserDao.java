package dao;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    public int saveUser(User user){
        Integer i = (Integer) hibernateTemplate.save(user);
        return i;
    }
}
