package dao;

import entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

    //HibernateDaoSupport来操作数据库更加方便

    //用来注入sessionFactory（不注入会报错）
    @Resource(name = "sessionFactory")
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    public User find(String userName, String password){
        //注意：以下是HQL语句
        String hql="from entity.User as u where u.userName=?0 and u.password=?1";
        List<?> users = getHibernateTemplate().find(hql,userName,password);
        return users.size() > 0? (User)users.get(0): null;//假数据，后期要通过Hibernate去数据库取
    }
}

