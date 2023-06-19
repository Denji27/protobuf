package com.vinsguru.protobuf;

import com.vinsguru.models.BodyStyle;
import com.vinsguru.models.Car;
import com.vinsguru.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {
        Car Accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();
        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2005)
                .setBodyStyle(BodyStyle.SEDAN)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2020, Accord)
                .putModel(2005, civic)
                .build();
        System.out.println(
                dealer.getModelOrThrow(2005).getBodyStyle()
        );
    }
}
