package com.bridgelabz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

public class HotelReservationTest {
    @Test
    public void whenHotelAddedToSystemShouldGetAdded() {
        Hotel hotel1 = new Hotel("Lakeewood", 110, 90, 80, 80, 3);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60, 110, 50, 4);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150, 100, 40, 5);
        // creating array
        Hotel[] hotelList = {hotel1, hotel2, hotel3};
        // asList method is used to return a fixed size list and  getting the list view of Array
        List<Hotel> hotels = Arrays.asList(hotelList);
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        // call add method
        hotelReservation.add(hotel1);
        hotelReservation.add(hotel2);
        hotelReservation.add(hotel3);
        // call getHotelList method
        List<Hotel> result = hotelReservation.getHotelList();
        // I want to test equality of two objects
        assertEquals(hotels, result);
    }
}