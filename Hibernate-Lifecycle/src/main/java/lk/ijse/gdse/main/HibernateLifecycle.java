package lk.ijse.gdse.main;

import lk.ijse.gdse.main.config.FactoryConfiguration;
import lk.ijse.gdse.main.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HibernateLifecycle {
    public static void main(String[] args) {
        /*transient state*/
        Customer customer = new Customer();
        customer.setName("john doe");

        /*persistance state*/
        Session session1 = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session1.beginTransaction();

        /*detached state*/
        // not in use  --> session.save(customer);
        session1.persist(customer);
        transaction.commit();

        /*removed state*/
        session1.close();

        /*without use object --> eligible to GC--> Garbage Collection*/

        //edited object
        customer.setName("jane doe");

        //get new session
        Session session2 = FactoryConfiguration.getInstance().getSession();

        //persistance state
        //update krnn puluwn --> session.update(customer);
        session2.merge(customer);

        /*removed state*/
        //session2.delete(customer);
        session2.remove(customer);



    }
}