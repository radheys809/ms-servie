package com.example.addressservice.controllers;

import com.example.addressservice.services.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AddressController {

    final AddressService addressService;

    @GetMapping("/address")
    public ResponseEntity<Object> getAddress() {
        return ResponseEntity.ok().body(addressService.getAddress());
    }

    @GetMapping("/address/{id}")
    public ResponseEntity<Object> getAddressById(@PathVariable("id") long id) {
        return ResponseEntity.ok().body(addressService.getAddressById(id));
    }
}
