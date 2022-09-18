
import java.util.*;
import org.hibernate.*;

@SuppressWarnings("unchecked")
public class ItemDAO {

	public void update(Item item) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(item);
		session.getTransaction().commit();
	}

	public List<Item> list() {
		String hql = "from Item ";
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		List<Item> list = query.list();
		session.getTransaction().commit();
		return list;
	}
}
