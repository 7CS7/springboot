package ormwithmvc;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public class UserDao {
	@Autowired
	private HibernateTemplate ht;
public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}
@Override
	public String toString() {
		return "UserDao [ht=" + ht + "]";
	}
public HibernateTemplate getHt() {
		return ht;
	}
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
public int saveUser(User user) {
	int id=(Integer)this.ht.save(user);
	return id;
}
}
