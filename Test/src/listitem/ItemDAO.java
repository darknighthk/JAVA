package listitem;

import java.util.*;
import org.hibernate.*;

@SuppressWarnings("unchecked")
public class ItemDAO {

	public List<Item> list() {
		String hql = "from Item ";
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		List<Item> list = query.list();
		session.getTransaction().commit();
		return list;
	}

	public List<Item> listByCategory(String category) {
		// FILL YOUR CODE
		String hql = "from Item where category="+category;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		List<Item> list = query.list();
		session.getTransaction().commit();
		return list;
	}
}
