package study.querydsl.entity.ialcon;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "customerName", "customerIrisName"})
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    public Customer(String customerName, String customerIrisCode) {
        this.customerName = customerName;
        this.customerIrisCode = customerIrisCode;
    }

    private String customerName;
    private String customerIrisCode;

}
