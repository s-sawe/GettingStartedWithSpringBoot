package com.example.amigoscode;

import com.example.amigoscode.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@RestController //this annotation makes the below class to serve rest endpoints
public class AmigoscodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeApplication.class, args);


    }
}




//THIS IS BELOW THE PUBLIC STATIC VOID MAIN METHOD

    /*@GetMapping //in order for this method to be served as a restful endpoint
    //public String hello(){
        //return "Hello World";
        //to form a JSON output, type the below
        public List<Student> hello() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )
        );

    }*/


