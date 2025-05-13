package lv.gderuki.gridbalancer;

import lv.gderuki.gridbalancer.model.EnergyTask;
import lv.gderuki.gridbalancer.repository.EnergyTaskRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class EnergyTaskRepositoryTest {

    @Autowired
    private EnergyTaskRepository repository;

    @Test
    @DisplayName("should persist and retrieve an EnergyTask")
    void testSaveAndFind() {
        final EnergyTask task = new EnergyTask();
        task.setName("Test Task");
        task.setPriority(1);
        task.setDurationMinutes(30);
        task.setEarliestHour(8);
        task.setLatestHour(18);

        repository.save(task);

        List<EnergyTask> all = repository.findAll();

        assertThat(all).hasSize(1);
        assertThat(all.get(0).getName()).isEqualTo("Test Task");
    }
}
