package finki.ukim.mk.carrent.service;

import finki.ukim.mk.carrent.model.Termin;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TerminService {
    Optional<Termin> findById(int terminId);

    Termin createTermin(LocalDate from, LocalDate to);

    void deleteById(Long terminId);

    List<Termin> getTerminesByCarId(String carId);

    void calculateNewTermines(String carId);
}
