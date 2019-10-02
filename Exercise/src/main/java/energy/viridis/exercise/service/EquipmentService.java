package energy.viridis.exercise.service;

import java.util.List;

import energy.viridis.exercise.model.Equipment;

public interface EquipmentService {

	Equipment get(Long id);

	List<Equipment> getAll();

}
