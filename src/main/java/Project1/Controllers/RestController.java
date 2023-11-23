package Project1.Controllers;


import Project1.DataBase.Person;
import Project1.ExceptiomHandling.NoSuchPersonException;
import Project1.ExceptiomHandling.PersonIncorrectData;
import Project1.Service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {


    private final PersonService personService = new PersonService();


    @GetMapping("/persons")
    public List<Person> showAllPersons(){
        return personService.getAllPersons();
    }

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable int id){
        Person person = personService.getPersonById(id);
        if (person == null) {
            throw new NoSuchPersonException("There is no a person with " + id + " id in database");
        }
        return person;
    }



    @PostMapping("/addPerson")
    public Person addNewPerson(@RequestBody Person person){
        personService.savePerson(person);
        return person;
    }

    @PutMapping("/updatePerson")
    public Person updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
        return person;
    }

    @DeleteMapping("/deletePerson/{id}")
    public String deletePersonById(@PathVariable int id){

        Person person = personService.getPersonById(id);
        if(person == null){
            throw new NoSuchPersonException("There is no a person with " + id + " id in database");
        } else {
            personService.deletePersonByID(id);
            return "Person with id: " + id + " was deleted";
        }
    }


    @ExceptionHandler
    public ResponseEntity<PersonIncorrectData> handleException(NoSuchPersonException exception){
        PersonIncorrectData data = new PersonIncorrectData();
        data.setText(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<PersonIncorrectData> handleException(Exception exception){
        PersonIncorrectData data = new PersonIncorrectData();
        data.setText(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }


}
