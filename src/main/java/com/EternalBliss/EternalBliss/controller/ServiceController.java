package com.EternalBliss.EternalBliss.controller;

import com.EternalBliss.EternalBliss.model.service;
import com.EternalBliss.EternalBliss.Service.serviceservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin("*")
public class ServiceController {

    @Autowired
    private serviceservice serviceservice;

    //Add Services
    @PostMapping
    public service addservice(@RequestBody service service){
        return serviceservice.addService(service);
    }

    //Get All Services
    @GetMapping
    public List<service> findAllServices() {
        return serviceservice.findAll();
    }

    //Update Service
    @PutMapping("/{id}")
    public service updateService(@PathVariable int id, @RequestBody service service) {
        return serviceservice.updateService(id, service);
    }

    //Delete Service
    @DeleteMapping("/{id}")
    public void deleteService(@PathVariable int id) {
        serviceservice.deleteService(id);
    }
}
