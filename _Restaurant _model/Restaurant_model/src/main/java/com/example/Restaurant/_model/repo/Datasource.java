package com.example.Restaurant._model.repo;

import com.example.Restaurant._model.entity.RestaurantModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class Datasource {
    @Bean
    public List<RestaurantModel>   getRestaurantModel(){
        return new ArrayList<>();
    }
}
