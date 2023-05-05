package irembo.gov.notification.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/email/")
public class EmailController {


    @GetMapping
    public ResponseEntity<String > submitEmail(){
        return new ResponseEntity<>("Email Sent ", HttpStatus.OK);
    }









}
