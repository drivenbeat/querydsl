package study.querydsl.entity.ialcon;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "productName", "productIrisCode"})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    public Product(String productName, String productIrisCode) {
        this.productName = productName;
        this.productIrisCode = productIrisCode;
    }

    private String productName;
    private String productIrisCode;
}
