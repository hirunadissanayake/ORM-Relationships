package lk.ijse.gdse.main;

import lk.ijse.gdse.main.config.FactoryConfiguration;
import lk.ijse.gdse.main.entity.Customer;
import lk.ijse.gdse.main.entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Jane Doe");

        List<Order> orders = new ArrayList<>();

        Order order1 = new Order();
        order1.setOrderDate("2025/02/03");
        order1.setCustomer(customer);

        Order order2 = new Order();
        order2.setOrderDate("2025/02/09");
        order2.setCustomer(customer);

        orders.add(order1);
        orders.add(order2);

        customer.setOrders(orders);

        Transaction tx = session.beginTransaction();
        session.save(customer);
        tx.commit();

        session.close();

    }
}