package pdp.uz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pdp.uz.domain.Income;

@Repository
public interface IncomeRepo extends JpaRepository<Income, Long> {
}
