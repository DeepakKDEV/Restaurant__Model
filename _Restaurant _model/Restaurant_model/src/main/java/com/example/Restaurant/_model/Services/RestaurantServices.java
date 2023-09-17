package com.example.Restaurant._model.Services;

import com.example.Restaurant._model.entity.RestaurantModel;
import com.example.Restaurant._model.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServices {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<RestaurantModel> getRestaurantModel() {
        return restaurantRepo.getRestaurantM();
    }

    public String addRestaurant(List<RestaurantModel> myModel) {
        getRestaurantModel().addAll(myModel);

        return myModel.size() + "RestaurantModel added!";
       }


    public String changeFood(Integer id, String speciality) {
        for(RestaurantModel  M: getRestaurantModel()){
            if(M.getRestaurantId().equals(id)){
                M.setSpecialityType(speciality);
                return "change  food Speciality";
            }
        }
        return "Id not match";
    }


    public String deleteValue(Integer id) {
        for(RestaurantModel m : getRestaurantModel() ){
            if(m.getRestaurantId().equals(id)){
                getRestaurantModel().remove(m);
                return "Delete value";
            }

        }
        return "id nt match";
    }
}
