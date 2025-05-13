package lv.gderuki.gridbalancer.dto;

import lombok.Data;

@Data
public class EnergyTaskDto {
    private String name;
    private int durationMinutes;
    private int earliestHour;
    private int latestHour;
    private int priority;
}

