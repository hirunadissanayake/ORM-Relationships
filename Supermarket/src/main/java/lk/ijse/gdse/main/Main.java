package lk.ijse.gdse.main;

import lk.ijse.gdse.main.config.FactoryConfiguration;
import lk.ijse.gdse.main.entity.Customer;
import org.hibernate.Session;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       FactoryConfiguration factoryConfiguration = FactoryConfiguration.getInstance();
       Session session = factoryConfiguration.getSession();

        //remove @ToString
        //remove inverse side relationship ->course work ekata danna epa

        Customer customer = session.get(Customer.class, "C001");
        System.out.println(customer);

        session.close();


    }
}