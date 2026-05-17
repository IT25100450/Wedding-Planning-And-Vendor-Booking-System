package com.EternalBliss.EternalBliss.Service;

import com.EternalBliss.EternalBliss.model.vendor;
import com.EternalBliss.EternalBliss.repository.vendorrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vendorservice {

    @Autowired
    private vendorrepo vendorRepository;

    public vendor addVendor(vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public List<vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    public vendor updateVendor(int id, vendor updatedVendor) {
        if (vendorRepository.existsById(id)) {
            updatedVendor.setVendorId(id);
            return vendorRepository.save(updatedVendor);
        }
        return null;
    }

    public void deleteVendor(int id) {
        vendorRepository.deleteById(id);
    }
}