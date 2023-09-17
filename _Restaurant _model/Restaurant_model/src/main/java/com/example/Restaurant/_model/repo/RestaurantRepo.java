package com.example.Restaurant._model.repo;

import com.example.Restaurant._model.entity.RestaurantModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepo {
    @Autowired
    private List<RestaurantModel> restaurantM;

    public List<RestaurantModel> getRestaurantM() {
        return restaurantM;
    }


}
