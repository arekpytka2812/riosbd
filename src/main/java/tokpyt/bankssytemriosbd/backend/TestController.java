package tokpyt.bankssytemriosbd.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestRepository repository;

    @GetMapping("/test/all")
    public ResponseEntity<List<TestEntity>> findAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/test/add")
    public ResponseEntity<Long> add(
            @RequestBody TestEntity entity
    ) {
        return ResponseEntity.ok(repository.save(entity).getId());
    }

}
