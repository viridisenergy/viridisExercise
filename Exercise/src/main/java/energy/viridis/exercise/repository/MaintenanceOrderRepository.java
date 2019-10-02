package energy.viridis.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import energy.viridis.exercise.model.MaintenanceOrder;

public interface MaintenanceOrderRepository extends JpaRepository<MaintenanceOrder, Long> {

}
