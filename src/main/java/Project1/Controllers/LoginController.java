package Project1.Controllers;


import Project1.DataBase.Meal;
import Project1.DataBase.Person;
import Project1.Service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class LoginController {
    private PersonService personService = new PersonService();

    @RequestMapping("/loginPageMethod")
    public String loginPageView(){
        return "login-view";
    }

    @RequestMapping("/registrationPageMethod")
    public String registrationPageView(HttpServletRequest request) {
        String resultPage;
        String password = request.getParameter("password");
        String passwordAgain = request.getParameter("passwordAgain");

        if (password != null && passwordAgain != null && password.equals(passwordAgain)) {
            Person person = new Person();
            person.setFirstName(request.getParameter("name"));
            person.setLastName(request.getParameter("lastName"));
            person.setLogin(request.getParameter("login"));
            person.setPassword(password);

            personService.savePerson(person);
            resultPage = "login-view";
        } else {
            resultPage = "registration-view";
        }
        return resultPage;
    }

    @RequestMapping("/successLoginPageMethod")
    public String resultName(HttpServletRequest request, Model model){
        List<Person> personList = personService.getAllPersons();
        Person person = null;
        String resultPage = null;
        for(Person p: personList){
            if(request.getParameter("login").equals(p.getLogin()) &&
            request.getParameter("password").equals(p.getPassword())){
                model.addAttribute("NameAttribute", p.getFirstName());
                person = p;
                resultPage = "loginResult-view";
            }
        }
        model.addAttribute("personAttribute", person);
        return resultPage;
    }
}
