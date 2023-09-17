package com.example.Restaurant._model.Controller;

import com.example.Restaurant._model.Services.RestaurantServices;
import com.example.Restaurant._model.entity.RestaurantModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class RestaurantController {
  @Autowired
  RestaurantServices servicesList;

    @PostMapping("restaurantModel")
     public String addRestaurant(@RequestBody List<RestaurantModel> myModel){
         return servicesList.addRestaurant(myModel);
     }

    @GetMapping("get/restaurantModel")
    public List<RestaurantModel> getAllModel()
    {
        return servicesList.getRestaurantModel();
    }
    @PutMapping("speciality/food/Id/{Id}")
    public String changeFood(@PathVariable Integer Id, @RequestParam String speciality){
        return servicesList.changeFood(Id,speciality);
    }
   @DeleteMapping("remove/value/{id}")
    public String deleteValue(@PathVariable Integer id){
        return servicesList.deleteValue(id);
    }
}