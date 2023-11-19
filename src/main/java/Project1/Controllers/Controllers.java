package Project1.Controllers;
import Project1.DataBase.*;
import Project1.Service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controllers {

    @RequestMapping("/cartViewMethod")
    public String showCart(@ModelAttribute("personAttribute") Person person){

        return "cart-view";
    }









    @RequestMapping("/showCartMethod")
    public String showCart(){

        return "cart-view";
    }


}
