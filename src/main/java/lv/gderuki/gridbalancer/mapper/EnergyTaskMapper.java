package lv.gderuki.gridbalancer.mapper;

import lv.gderuki.gridbalancer.dto.EnergyTaskDto;
import lv.gderuki.gridbalancer.model.EnergyTask;
import org.springframework.stereotype.Component;

@Component
public class EnergyTaskMapper {

    public EnergyTask toEntity(EnergyTaskDto dto) {
        final EnergyTask task = new EnergyTask();
        task.setName(dto.getName());
        task.setDurationMinutes(dto.getDurationMinutes());
        task.setEarliestHour(dto.getEarliestHour());
        task.setLatestHour(dto.getLatestHour());
        task.setPriority(dto.getPriority());
        return task;
    }

    public EnergyTaskDto toDto(EnergyTask task) {
        final EnergyTaskDto dto = new EnergyTaskDto();
        dto.setName(task.getName());
        dto.setDurationMinutes(task.getDurationMinutes());
        dto.setEarliestHour(task.getEarliestHour());
        dto.setLatestHour(task.getLatestHour());
        dto.setPriority(task.getPriority());
        return dto;
    }

}
