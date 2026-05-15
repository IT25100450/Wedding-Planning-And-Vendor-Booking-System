package com.EternalBliss.EternalBliss.model;
import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="vendors")

public class vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vendor_id")
    @JsonProperty("vendor_id")
    private int vendorId;

    @Column(name = "vendor_name")
    @JsonProperty("vendor_name")
    private String vendorName;
    
    @Column(name = "vendor_email")
    @JsonProperty("vendor_email")
    private String vendorEmail;
    
    @Column(name = "vendor_phone")
    @JsonProperty("vendor_phone")
    private String vendorPhone;
    
    @Column(name = "vendor_type")
    @JsonProperty("vendor_type")
    private String vendorType;
    
    @Column(name = "vendor_price")
    @JsonProperty("vendor_price")
    private String vendorPrice;
    
    @Column(name = "vendor_address")
    @JsonProperty("vendor_address")
    private String vendorAddress;
    
    // New fields from the form
    @Column(name = "contact_person")
    private String contactPerson;
    
    private String website;
    private String status;
    private String description;

    // Getters and Setters

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public String getVendorPrice() {
        return vendorPrice;
    }

    public void setVendorPrice(String vendorPrice) {
        this.vendorPrice = vendorPrice;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
