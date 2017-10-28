package it.ts.dotcom.example.client.web.controller;

import it.ts.dotcom.example.client.web.component.DiscoveryClientExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/discovery", produces = MediaType.APPLICATION_JSON_VALUE)
public class DiscoveryController {

    @Autowired
    private DiscoveryClientExample discoveryClientExample;

    @GetMapping("/services")
    public ResponseEntity<?> listServices() {
        try {
            return new ResponseEntity<>(discoveryClientExample.getServices(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
