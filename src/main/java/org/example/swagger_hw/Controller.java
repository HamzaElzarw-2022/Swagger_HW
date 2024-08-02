package org.example.swagger_hw;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/voice")
    String sendVoice(@RequestParam int a, @RequestParam int b, @RequestParam int duration, @RequestParam String location) {

        String message = "A call was made from "+ a +" to "+ b +" for "+ duration +" minutes in "+ location +".";
        System.out.println(message);
        return message;
    }

    @GetMapping("/message")
    String sendMessage(@RequestParam int a, @RequestParam int b, @RequestParam String location) {

        String message = "A message was sent from "+ a +" to "+ b +" in "+ location +".";
        System.out.println(message);

        return message;
    }

    @GetMapping("/data")
    String sendData(@RequestParam int a, @RequestParam int mb, @RequestParam String rg, @RequestParam String location) {

        String message = "number "+ a +" has consumed "+ mb +"MB with rating group "+ rg + " in "+ location +".";
        System.out.println(message);

        return message;
    }

}
