import java.util.*;
import org.hibernate.*;

@SuppressWarnings("unchecked")
public class AdvertisementDAO {
    public void insert(Advertisement advertisement) {
		// FILL YOUR CODE
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(advertisement);
		session.getTransaction().commit();
	}

	public List<Advertisement> list() {
		// FILL YOUR CODE
		String hql = "from Advertisement order by id";
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		List<Advertisement> list = query.list();
		session.getTransaction().commit();
		return list;
	}

	public Advertisement find(int id) {
		// FILL YOUR CODE
		String hql = "from Advertisement where id=" + id;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery(hql);
		Advertisement a = new Advertisement();
		List<Advertisement> list = query.list();
		if (list.isEmpty()) {
			a = null;
		} else {
			a = (Advertisement) list.get(0);
			session.getTransaction().commit();
		}
		return a;
	}

	public void update(Advertisement advertisement) {
		// FILL YOUR CODE
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(advertisement);
		session.getTransaction().commit();
	}
}