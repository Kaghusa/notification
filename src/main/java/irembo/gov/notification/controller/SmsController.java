package irembo.gov.notification.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/sms/")
public class SmsController {
    @GetMapping
    public ResponseEntity<String > submitEmail(){
        return new ResponseEntity<>("Sms Sent ", HttpStatus.OK);
    }








}
