package com.vinsguru.protobuf;

import com.google.protobuf.Int32Value;
import com.vinsguru.models.Address;
import com.vinsguru.models.Car;
import com.vinsguru.models.Person;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CompositionDemo {
    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setPostbox(123)
                .setStreet("main street")
                .setCity("Atlanta")
                .build();
        Car Accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();
        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2005)
                .build();
        List<Car> cars = new ArrayList<>();
        cars.add(Accord);
        cars.add(civic);
        Person person = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(25).build())
                .setAddress(address)
                .addAllCar(cars)
//                .addCar(Accord)
//                .addCar(civic)
                .build();
        System.out.println(person);
    }
}
