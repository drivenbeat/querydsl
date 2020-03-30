package study.querydsl.repository.ialcon;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.ialcon.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
