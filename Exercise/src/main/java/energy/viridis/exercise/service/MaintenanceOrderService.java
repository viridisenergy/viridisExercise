package energy.viridis.exercise.service;

import java.util.List;

import energy.viridis.exercise.model.MaintenanceOrder;

public interface MaintenanceOrderService {

	MaintenanceOrder get(Long id);

	List<MaintenanceOrder> getAll();

}
