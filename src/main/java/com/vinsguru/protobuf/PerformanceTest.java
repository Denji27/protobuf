package com.vinsguru.protobuf;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
import com.google.protobuf.InvalidProtocolBufferException;
import com.vinsguru.json.JPerson;
import com.vinsguru.models.Person;

public class PerformanceTest {
    public static void main(String[] args){
        // json
        JPerson person = new JPerson();
        person.setName("sam");
        person.setAge(10);
        ObjectMapper mapper = new ObjectMapper();

        Runnable json = () -> {
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                System.out.println(bytes.length);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        //protobuf
        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();

        Runnable proto = () ->{
            try {
                byte[] bytes = sam.toByteArray();
                System.out.println(bytes.length);
                Person sam1 = Person.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        };

        runPerformanceTest(json, "JSON");
        runPerformanceTest(proto, "PROTO");
    }
    private static void runPerformanceTest(Runnable runnable, String method){
        long time1= System.currentTimeMillis();
        for (int i=0; i<10; i++){
            runnable.run();
        }
        long time2= System.currentTimeMillis();
        System.out.println(method + ": " + (time2-time1) + "ms");
    }
}
