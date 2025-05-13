package lv.gderuki.gridbalancer.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EnergyTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int durationMinutes;
    private int earliestHour;
    private int latestHour;
    private int priority;

}
