package energy.viridis.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import energy.viridis.exercise.model.Equipment;
import energy.viridis.exercise.service.EquipmentService;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {

	@Autowired
	private EquipmentService equipmentService;

	@GetMapping
	public ResponseEntity<List<Equipment>> getAll() {
		return ResponseEntity.ok().body(equipmentService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Equipment> get(@PathVariable("id") Long id) {
		return ResponseEntity.ok().body(equipmentService.get(id));
	}

}
