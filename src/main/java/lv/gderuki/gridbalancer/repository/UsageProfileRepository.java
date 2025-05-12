package lv.gderuki.gridbalancer.repository;

import lv.gderuki.gridbalancer.model.UsageProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsageProfileRepository extends JpaRepository<UsageProfile, Long> {
}

