package com.example.Restaurant._model.entity;

import jakarta.annotation.sql.DataSourceDefinition;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantModel {
   // @NotBlank
    private Integer restaurantId;

  // @NotBlank
    private String restaurantName;

    private String restaurantAddress;
   // @Size(min=10,max=10)
   // @Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")
    private String restaurantNumber;

    private String specialityType;

    private Integer totalStaff;


    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getSpecialityType() {
        return specialityType;
    }

    public void setSpecialityType(String specialityType) {
        this.specialityType = specialityType;
    }

    public Integer getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(Integer totalStaff) {
        this.totalStaff = totalStaff;
    }
}
