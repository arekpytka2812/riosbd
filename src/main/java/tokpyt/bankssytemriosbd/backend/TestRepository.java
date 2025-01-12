package tokpyt.bankssytemriosbd.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TestRepository extends JpaRepository<TestEntity, Long> {

    @Transactional(readOnly = true)
    List<TestEntity> findByName(String name);

}
