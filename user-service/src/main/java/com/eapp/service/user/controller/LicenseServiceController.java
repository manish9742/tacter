package com.eapp.service.user.controller;

import com.eapp.service.user.entity.License;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class LicenseServiceController {


    @GetMapping(value="{licenseid}")
    public License getLicense(@PathVariable("licenseid") String licenseid){

        return new License();

    }



}
