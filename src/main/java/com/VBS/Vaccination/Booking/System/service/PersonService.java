package com.VBS.Vaccination.Booking.System.service;

import com.VBS.Vaccination.Booking.System.dtos.RequestDtos.AddPersonRequestDto;
import com.VBS.Vaccination.Booking.System.dtos.ResponseDtos.AddPersonResponseDto;
import com.VBS.Vaccination.Booking.System.exceptions.PersonNotFoundException;
import com.VBS.Vaccination.Booking.System.models.Person;
import com.VBS.Vaccination.Booking.System.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public AddPersonResponseDto addPerson(AddPersonRequestDto addPersonRequestDto) {

        // Convert Request Dto -> Enttity
        Person person = new Person();
        person.setName(addPersonRequestDto.getName());
        person.setAge(addPersonRequestDto.getAge());
        person.setEmailId(addPersonRequestDto.getEmailId());
        person.setGender(addPersonRequestDto.getGender());
//        person.setDose1Taken(false);
//        person.setDose2Taken(false);
//        person.setCertificate(null);

        Person savedPerson = personRepository.save(person);

        // saved entity -> response dto
        AddPersonResponseDto addPersonResponseDto = new AddPersonResponseDto();
        addPersonResponseDto.setName(savedPerson.getName());
        addPersonResponseDto.setMessage("Congrats! You have been registered");
        return addPersonResponseDto;
    }

    public String updateEmail(String oldEmail, String newEmail) {

        Person person = personRepository.findByEmailId(oldEmail);
        if(person == null){
            throw new PersonNotFoundException("Sorry email doesn't exist");
        }

        person.setEmailId(newEmail);
        personRepository.save(person);
        return "Congrats!! Your email has been updated successfully";
    }
}
