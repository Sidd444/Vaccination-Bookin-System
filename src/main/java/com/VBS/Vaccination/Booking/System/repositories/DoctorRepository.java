package com.VBS.Vaccination.Booking.System.repositories;

import com.VBS.Vaccination.Booking.System.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

    @Query(value = "select * from doctor where age > :age",nativeQuery = true)
    List<Doctor> getByAgeGreaterThan(int age);

//    @Query(value = "select d from Doctor as d where d.age > :age")
//    List<Doctor> getByAgeGreaterThan(int age);
}
