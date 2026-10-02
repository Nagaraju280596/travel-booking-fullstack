package com.travelbooking.controller;

import com.travelbooking.entity.TravelDetails;
import com.travelbooking.repository.TravelDetailsRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/travel-details")
@CrossOrigin
public class TravelDetailsController {
    private final TravelDetailsRepository repository;
    public TravelDetailsController(TravelDetailsRepository repository){this.repository=repository;}

    @PostMapping
    public TravelDetails save(@RequestBody TravelDetails details){return repository.save(details);}

    @GetMapping
    public List<TravelDetails> all(){return repository.findAll();}

    @GetMapping("/{id}")
    public TravelDetails one(@PathVariable Long id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Travel details not found"));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        repository.deleteById(id);
        return "Travel details deleted successfully";
    }
}
