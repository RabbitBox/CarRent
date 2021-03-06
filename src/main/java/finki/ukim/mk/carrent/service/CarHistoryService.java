package finki.ukim.mk.carrent.service;

import finki.ukim.mk.carrent.model.CarHistory;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface CarHistoryService {
    CarHistory findById(Long carHistoryId);

    CarHistory createCarHistory(LocalDate registrationDate, String breaksStatus, String frontGlassStatus, String wheelStatus, String engineStatus, int kmPassed, String description, Long carId);

    List<CarHistory> getAll();

    List<CarHistory> searchByCarId(Long carId);

    void deleteById(Long carHistoryId);

    CarHistory editHistory(Long historyId, Long carId, LocalDate registrationDate, String breaksStatus, String frontGlassStatus, String wheelStatus, String engineStatus, int kmPassed, String description);
}
