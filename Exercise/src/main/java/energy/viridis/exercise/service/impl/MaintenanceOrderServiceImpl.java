package energy.viridis.exercise.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import energy.viridis.exercise.model.MaintenanceOrder;
import energy.viridis.exercise.repository.MaintenanceOrderRepository;
import energy.viridis.exercise.service.MaintenanceOrderService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MaintenanceOrderServiceImpl implements MaintenanceOrderService {

	@Autowired
	private MaintenanceOrderRepository maintenanceOrderRepository;

	@Override
	public MaintenanceOrder get(Long id) {

		log.info("Retrieving Maintenance Order - id: {}", id);
		return maintenanceOrderRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Maintenance Order not found."));

	}

	@Override
	public List<MaintenanceOrder> getAll() {

		log.info("Listing all Maintenance Orders...");
		return maintenanceOrderRepository.findAll();

	}

}
