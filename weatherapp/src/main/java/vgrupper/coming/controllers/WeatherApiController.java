package vgrupper.coming.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vgrupper.coming.models.City;
import vgrupper.coming.services.CityService;

/**
 * City controller.
 */

@RestController
@RequestMapping("/api/weather")
public class WeatherApiController {

   private final CityService cityService;

    public WeatherApiController(CityService cityService) {
        this.cityService = cityService;
    }


    @RequestMapping("/city/{id}")
    public City getCity(@PathVariable Integer id) {
        return this.cityService.getCityById(id);
    }
}
//@Controller
//public class CityController {
//
//    private CityService cityService;
//
//    @Autowired
//    public void setCityService(CityService cityService) {
//        this.cityService = cityService;
//    }
//
//    /**
//     * List all cities.
//     *
//     * @param model
//     * @return
//     */
//    @RequestMapping(value = "/cities", method = RequestMethod.GET)
//    public String list(Model model) {
//        model.addAttribute("cities", cityService.listAllCities());
//        System.out.println("Returning cities:");
//        return "cities";
//    }
//
//    /**
//     * View a specific city by its id.
//     *
//     * @param id
//     * @param model
//     * @return
//     */
//    @RequestMapping("city/{id}")
//    public String showCity(@PathVariable Integer id, Model model) {
//        model.addAttribute("city", cityService.getCityById(id));
//
//        City myCity = new City();
//        myCity = cityService.getCityById(id);
//        System.out.println(myCity.getCityName());
//
//        return "cityshow";
//    }
//
//    // Afficher le formulaire de modification du City
//    @RequestMapping("city/edit/{id}")
//    public String edit(@PathVariable Integer id, Model model) {
//        model.addAttribute("city", cityService.getCityById(id));
//        return "cityform";
//    }
//
//    /**
//     * New city.
//     *
//     * @param model
//     * @return
//     */
//    @RequestMapping("city/new")
//    public String newCity(Model model) {
//        model.addAttribute("city", new City());
//        return "cityform";
//    }
//
//    /**
//     * Save city to database.
//     *
//     * @param city
//     * @return
//     */
//    @RequestMapping(value = "city", method = RequestMethod.POST)
//    public String saveCity(City city) {
//        cityService.saveCity(city);
//        return "redirect:/city/" + city.getId();
//    }
//
//    /**
//     * Delete city by its id.
//     *
//     * @param id
//     * @return
//     */
//    @RequestMapping("city/delete/{id}")
//    public String delete(@PathVariable Integer id) {
//        cityService.deleteCity(id);
//        return "redirect:/cities";
//    }
//
//}
