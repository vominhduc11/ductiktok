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
				"jdbc:mysql://ubyyhhehghcfjsyp:rANjkOIKe2KVIHxThxrn@bsvikz4rvforjf6ytssw-mysql.services.clever-cloud.com:3306/bsvikz4rvforjf6ytssw");
		properties.put(Environment.USER, "ubyyhhehghcfjsyp");
		properties.put(Environment.PASS, "rANjkOIKe2KVIHxThxrn");
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.SHOW_SQL, "true");

		cfg.setProperties(properties);

		cfg.addAnnotatedClass(recAcc.class);
		cfg.addAnnotatedClass(discover.class);
		cfg.addAnnotatedClass(link.class);
		cfg.addAnnotatedClass(posts.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();

		FACTORY = cfg.buildSessionFactory(serviceRegistry);
	}
}
