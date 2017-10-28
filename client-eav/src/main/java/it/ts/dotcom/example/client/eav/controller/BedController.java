package it.ts.dotcom.example.client.eav.controller;

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

    @GetMapping("/{code}")
    public ResponseEntity<?> getBed(@PathVariable(value = "code", required = true) @NotNull String code) {
        System.out.println("Code: " + code);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }


}
