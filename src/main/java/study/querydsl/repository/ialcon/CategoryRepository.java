package study.querydsl.repository.ialcon;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.ialcon.Catetory;

public interface CategoryRepository extends JpaRepository<Catetory, Long> {
}
