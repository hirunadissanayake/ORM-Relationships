package lk.ijse.gdse.main.config;


import lk.ijse.gdse.main.entity.Customer;
import lk.ijse.gdse.main.entity.Item;
import lk.ijse.gdse.main.entity.Order;
import lk.ijse.gdse.main.entity.OrderDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private SessionFactory sessionFactory;

    private static FactoryConfiguration factoryConfiguration;

    private FactoryConfiguration() {
        Configuration config = new Configuration().configure();

        config.addAnnotatedClass(Customer.class);
        config.addAnnotatedClass(Item.class);
        config.addAnnotatedClass(Order.class);
        config.addAnnotatedClass(OrderDetails.class);

        sessionFactory = config.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance() {
        /*if (factoryConfiguration == null) {
            factoryConfiguration = new FactoryConfiguration();
        }
        return factoryConfiguration;*/
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;
    }
    public Session getSession() {
        return sessionFactory.openSession();
    }

}
