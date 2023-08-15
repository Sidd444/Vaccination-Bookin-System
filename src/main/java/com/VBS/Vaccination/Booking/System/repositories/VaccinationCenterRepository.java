package com.VBS.Vaccination.Booking.System.repositories;


import com.VBS.Vaccination.Booking.System.models.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter,Integer> {
}
