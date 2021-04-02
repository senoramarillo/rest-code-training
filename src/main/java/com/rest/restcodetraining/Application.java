package com.rest.restcodetraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @GetMapping
//    public List<Student> hello() {
//        return List.of(new Student(
//        		1L,
//                "Tom",
//                "tom.james@gmail.com",
//                LocalDate.of(2000, Month.JANUARY, 1),
//                21));
//    }

}
