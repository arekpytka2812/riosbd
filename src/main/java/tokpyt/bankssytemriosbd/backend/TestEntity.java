package tokpyt.bankssytemriosbd.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Table(name = "test")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class TestEntity {

    @Id
    Long id;

    String name;
    String testName;
}
