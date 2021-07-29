package com.example.postvariable.location;

import com.example.postvariable.post.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LocationService {

    Location location1 = new Location("l1", "Lagos");
    Location location2 = new Location("l2", "Asaba");
    Location location3 = new Location("l3", "Budapest");

    private List<Location> locations = new ArrayList<>(Arrays.asList(location1, location2, location3));

    public List<Location> getAllLocations() {
        return locations;
    }

    public Location getLocation(String id) {
        Location location = locations.stream()
                .filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);
        return location;
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void updateLocation(String id, Location location) {

        for(int i = 0; i < locations.size(); i++) {

            Location l = locations.get(i);

            if (l.getId().equals(id)) {
                locations.set(i, location);
            }
        }
    }

}
