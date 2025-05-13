package lv.gderuki.gridbalancer.service;

import lv.gderuki.gridbalancer.model.EnergyTask;
import lv.gderuki.gridbalancer.repository.EnergyTaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnergyTaskService {

    private final EnergyTaskRepository repository;

    public EnergyTaskService(EnergyTaskRepository repository) {
        this.repository = repository;
    }

    public List<EnergyTask> findAll() {
        return repository.findAll();
    }

    public EnergyTask save(EnergyTask task) {
        return repository.save(task);
    }
}
