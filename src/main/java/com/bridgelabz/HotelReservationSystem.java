package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelReservationSystem {
    //Creating a List of type Hotel using ArrayList
    private final List<Hotel> hotels;
    public HotelReservationSystem() {
        this.hotels = new ArrayList<Hotel>();
    }
    //create add method with the specified name
    public void add(Hotel hotel) {
        this.hotels.add(hotel);
    }
    public List<Hotel> getHotelList() {
        return this.hotels;
    }
}