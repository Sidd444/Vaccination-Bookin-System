package com.VBS.Vaccination.Booking.System.repositories;


import com.VBS.Vaccination.Booking.System.models.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose,Integer> {
}
