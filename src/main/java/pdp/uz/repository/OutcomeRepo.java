package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.domain.Outcome;

@Repository
public interface OutcomeRepo extends JpaRepository<Outcome, Long> {
}
