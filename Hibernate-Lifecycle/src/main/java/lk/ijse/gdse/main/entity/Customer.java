package lk.ijse.gdse.main.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //AUTO - hibernate decided auto value
    //IDENTITY - database generate auto value
    //for custom value don't use @GeneratedValue
    private int id;
    private String name;

}
