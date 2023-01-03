package iliikata.h2try.controller;
import iliikata.h2try.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/signup")
public class CarController {
@Autowired
    CarController carService;

    @GetMapping
    public String getCar(Model model){
        model.addAttribute("book",new Car());
        Iterable<Car> temp=carService.findAll();
        assert temp != null;
        for (Car b:
             temp) {
            System.out.println(b.getHorsePower());
        }
        model.addAttribute("car",temp);
        return "signup";
    }

    private Iterable<Car> findAll() {
        return null;
    }

    @PostMapping
    public String postBook(@ModelAttribute Car car){
        System.out.println("You are in our carSale");
        carService.save();
        return "redirect:/signup";
    }

    private void save() {
    }


    @GetMapping("del")
    public String delPerson(){
            carService.CarControler();
        return "redirect:/signup";
    }

    private void CarControler() {
    }


}
