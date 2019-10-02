package energy.viridis.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import energy.viridis.exercise.model.MaintenanceOrder;
import energy.viridis.exercise.service.MaintenanceOrderService;

@RestController
@RequestMapping("/api/maintenance-order")
public class MaintenanceOrderController {

	@Autowired
	private MaintenanceOrderService maintenanceOrderService;

	@GetMapping
	public ResponseEntity<List<MaintenanceOrder>> getAll() {
		return ResponseEntity.ok().body(maintenanceOrderService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<MaintenanceOrder> get(@PathVariable("id") Long id) {
		return ResponseEntity.ok().body(maintenanceOrderService.get(id));
	}
}
