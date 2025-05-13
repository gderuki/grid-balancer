package lv.gderuki.gridbalancer.repository;

import lv.gderuki.gridbalancer.model.EnergyTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyTaskRepository extends JpaRepository<EnergyTask, Long> {
}

