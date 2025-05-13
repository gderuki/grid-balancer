package lv.gderuki.gridbalancer.controller;

import lv.gderuki.gridbalancer.dto.EnergyTaskDto;
import lv.gderuki.gridbalancer.mapper.EnergyTaskMapper;
import lv.gderuki.gridbalancer.model.EnergyTask;
import lv.gderuki.gridbalancer.service.EnergyTaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class EnergyTaskController {

    private final EnergyTaskService service;
    private final EnergyTaskMapper mapper;

    public EnergyTaskController(EnergyTaskService service, EnergyTaskMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<EnergyTaskDto> getAll() {
        return service.findAll().stream()
                .map(mapper::toDto)
                .toList();
    }

    @PostMapping
    public EnergyTaskDto create(@RequestBody EnergyTaskDto dto) {
        final EnergyTask task = mapper.toEntity(dto);
        return mapper.toDto(service.save(task));
    }
}
