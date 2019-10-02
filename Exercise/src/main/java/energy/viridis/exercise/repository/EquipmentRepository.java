package energy.viridis.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import energy.viridis.exercise.model.Equipment;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
