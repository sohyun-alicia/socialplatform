package com.example.postvariable.location;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RequestMapping(value = "/locations")
@Api(tags = {"Location API"})
@RestController
@RequiredArgsConstructor
public class LocationController {

    @Autowired
    public LocationService locationService;

    @ApiOperation(value = "getAllLocations", response = Location.class)
    @GetMapping(value = "")
    public List<Location> getAllLocations()
    {
        return locationService.getAllLocations();
    }

    @RequestMapping(value = "/{id}")
    public Location getLocation(@PathVariable String id) { return locationService.getLocation(id); }

    @PostMapping(value="")
    public void addLocation(@RequestBody Location location) {
        locationService.addLocation(location);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateLocation(@RequestBody Location location, @PathVariable String id) {

        locationService.updateLocation(id, location);

    }

}
