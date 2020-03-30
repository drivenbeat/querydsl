package study.querydsl.repository.ialcon;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.ialcon.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
