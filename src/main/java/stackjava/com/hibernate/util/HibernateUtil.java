package stackjava.com.hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import stackjava.com.enity.discover;
import stackjava.com.enity.link;
import stackjava.com.enity.posts;
import stackjava.com.enity.recAcc;
import stackjava.com.enity.user;

public class HibernateUtil {
	private static final SessionFactory FACTORY;

	public static SessionFactory getFactory() {
		return FACTORY;
	}

	static {
		Configuration cfg = new Configuration();
		Properties properties = new Properties();

		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		properties.put(Environment.URL,
				"jdbc:mysql://ugendwzigclq6jhg:2oY2mwmGJ2USzbaHYYc7@blfqvhw1l1bivgjwrv5p-mysql.services.clever-cloud.com:3306/blfqvhw1l1bivgjwrv5p");
		properties.put(Environment.USER, "ugendwzigclq6jhg");
		properties.put(Environment.PASS, "2oY2mwmGJ2USzbaHYYc7");
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.SHOW_SQL, "true");

		cfg.setProperties(properties);

		cfg.addAnnotatedClass(recAcc.class);
		cfg.addAnnotatedClass(discover.class);
		cfg.addAnnotatedClass(link.class);
		cfg.addAnnotatedClass(posts.class);
		cfg.addAnnotatedClass(user.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();

		FACTORY = cfg.buildSessionFactory(serviceRegistry);
	}
}
