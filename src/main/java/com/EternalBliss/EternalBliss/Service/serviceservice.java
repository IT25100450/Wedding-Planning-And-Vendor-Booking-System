package com.EternalBliss.EternalBliss.Service;

import com.EternalBliss.EternalBliss.model.service;
import com.EternalBliss.EternalBliss.repository.servicerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class serviceservice {

    @Autowired
    private servicerepo servicerepo;

    public service addService(service service) {
        return servicerepo.save(service);
    }
    public List<service> findAll() {
        return servicerepo.findAll();
    }
    public service updateService(int id, service serviceDetails) {
        return servicerepo.findById(id).map(existingService -> {
            existingService.setService_name(serviceDetails.getService_name());
            existingService.setService_description(serviceDetails.getService_description());
            existingService.setPrice(serviceDetails.getPrice());
            existingService.setAvailability(serviceDetails.getAvailability());
            existingService.setCategory(serviceDetails.getCategory());
            existingService.setEmoji(serviceDetails.getEmoji());
            return servicerepo.save(existingService);
        }).orElse(null);
    }
    public void deleteService(int id) {
        servicerepo.deleteById(id);
    }
}
