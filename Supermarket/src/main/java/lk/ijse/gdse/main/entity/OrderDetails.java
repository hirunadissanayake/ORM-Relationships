package lk.ijse.gdse.main.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order_details")
public class OrderDetails {
//    @Id
//    private int id;
    @EmbeddedId
    private OrderDetailsId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name= "order_id")
    private Order order;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name= "item_id")
    private Item item;

    private int quantity;

    @Column(scale = 2,name = "unit_price", precision = 10)
    private BigDecimal unitPrice;
}
