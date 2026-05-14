package com.EternalBliss.EternalBliss.controller;

import com.EternalBliss.EternalBliss.model.vendor;
import com.EternalBliss.EternalBliss.Service.vendorservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
@CrossOrigin("*")
public class VendorController {

    @Autowired
    private vendorservice vendorService;

    // Add Vendor
    @PostMapping
    public vendor addVendor(@RequestBody vendor vendor) {
        return vendorService.addVendor(vendor);
    }

    // Get All Vendors
    @GetMapping
    public List<vendor> getAllVendors() {
        return vendorService.getAllVendors();
    }

    // Update Vendor
    @PutMapping("/{id}")
    public vendor updateVendor(@PathVariable int id, @RequestBody vendor vendor) {
        return vendorService.updateVendor(id, vendor);
    }

    // Delete Vendor
    @DeleteMapping("/{id}")
    public void deleteVendor(@PathVariable int id) {
        vendorService.deleteVendor(id);
    }
}