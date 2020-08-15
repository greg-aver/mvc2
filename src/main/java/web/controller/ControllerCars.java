package web.controller;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@PropertySource("classpath:language.properties")
@Controller
public class ControllerCars {
    @GetMapping(value = "/cars")
    public String PrintListOfCars(
            @RequestParam(value = "local", defaultValue = "en", required = false) String local,
            ModelMap model) {
        if (local.equals("en")) {
            model.addAttribute("car", "CARS");
        } else {
            model.addAttribute("car", "МАШИНЫ");
        }
        model.addAttribute("listCars", CarService.getListCar());
        return "cars/cars";
    }
}
