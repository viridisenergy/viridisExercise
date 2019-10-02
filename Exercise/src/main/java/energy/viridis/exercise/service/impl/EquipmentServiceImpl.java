package energy.viridis.exercise.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import energy.viridis.exercise.model.Equipment;
import energy.viridis.exercise.repository.EquipmentRepository;
import energy.viridis.exercise.service.EquipmentService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EquipmentServiceImpl implements EquipmentService {

	@Autowired
	private EquipmentRepository equipmentRepository;

	@Override
	public Equipment get(Long id) {

		log.info("Retrieving Equipment - id: {}", id);
		return equipmentRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Equipment not found."));

	}

	@Override
	public List<Equipment> getAll() {

		log.info("Listing all Equipment");
		return equipmentRepository.findAll();

	}

}
