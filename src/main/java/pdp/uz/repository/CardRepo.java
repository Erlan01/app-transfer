package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.domain.Card;

@Repository
public interface CardRepo extends JpaRepository<Card, Long> {
}
