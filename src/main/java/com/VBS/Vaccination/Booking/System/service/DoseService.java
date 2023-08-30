package com.VBS.Vaccination.Booking.System.service;


import com.VBS.Vaccination.Booking.System.dtos.RequestDtos.BookDose1RequestDto;
import com.VBS.Vaccination.Booking.System.exceptions.DoseAlreadyTakenException;
import com.VBS.Vaccination.Booking.System.exceptions.PersonNotFoundException;
import com.VBS.Vaccination.Booking.System.models.Dose;
import com.VBS.Vaccination.Booking.System.models.Person;
import com.VBS.Vaccination.Booking.System.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DoseService {
    @Autowired
    PersonRepository personRepository;

//    public Dose getDose1(int personId, DoseType doseType) {
//
//        Optional<Person> optionalPerson = personRepository.findById(personId);
//
//        // check if person exists or not
//        if(!optionalPerson.isPresent()){
//            throw new PersonNotFoundException("Invalid PersonId");
//        }
//
//        Person person = optionalPerson.get();
//        // check if dose 1 is already taken
//        if(person.isDose1Taken()){
//            throw new DoseAlreadyTakenException("Dose 1 already taken");
//        }
//
//        // Create a Dose
//        Dose dose = new Dose();
//        dose.setDoseId(String.valueOf(UUID.randomUUID()));
//        dose.setDoseType(doseType);
//        dose.setPerson(person);
//
//        person.setDose1Taken(true);
//        person.getDosesTaken().add(dose);
//        Person savedPerson = personRepository.save(person);
//
//        return savedPerson.getDosesTaken().get(0);
//    }

    public Dose getDose1(BookDose1RequestDto bookDose1RequestDto) {

        Optional<Person> optionalPerson = personRepository.findById(bookDose1RequestDto.getPersonId());

        // check if person exists or not
        if(!optionalPerson.isPresent()){
            throw new PersonNotFoundException("Invalid PersonId");
        }

        Person person = optionalPerson.get();
        // check if dose 1 is already taken
        if(person.isDose1Taken()){
            throw new DoseAlreadyTakenException("Dose 1 already taken");
        }

        // Create a Dose from RequestDto
        Dose dose = new Dose();
        dose.setDoseId(String.valueOf(UUID.randomUUID()));
        dose.setDoseType(bookDose1RequestDto.getDoseType());
        dose.setPerson(person);

        person.setDose1Taken(true);
        person.getDosesTaken().add(dose);
        Person savedPerson = personRepository.save(person);

        return savedPerson.getDosesTaken().get(0);
    }
}
