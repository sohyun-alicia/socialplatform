package com.example.postvariable.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LocationController {

    @Autowired
    public LocationService locationService;

    @RequestMapping(value = "/locations")
    public List<Location> getAllLocations()
    {
        return locationService.getAllLocations();
    }

}
