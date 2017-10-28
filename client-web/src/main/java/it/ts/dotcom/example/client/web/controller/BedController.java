package it.ts.dotcom.example.client.web.controller;

import it.ts.dotcom.example.client.web.client.BedClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/beds", produces = MediaType.APPLICATION_JSON_VALUE)
public class BedController {

    @Autowired
    private BedClient bedClient;

    @GetMapping("/{code}")
    public ResponseEntity<?> getBed(@PathVariable(value = "code", required = true) @NotNull String code) {
        try {
            return new ResponseEntity<>(bedClient.getBed(code), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
