package com.EternalBliss.EternalBliss.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonFormat;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "bookings")
public class booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String ref;

    @Column(length = 255)
    private String customer;

    @Column(length = 500)
    private String vendor;

    @Column(length = 255)
    private String service;

    @Column(name = "event_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate eventDate;

    @Column(length = 50)
    private String status;

    @Column(length = 100)
    private String total;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(name = "created_at", length = 50)
    private String createdAt;

    @Column(name = "user_id", length = 50)
    private String userId;

    // ── Getters & Setters ─────────────────────────────────────────

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRef() { return ref; }
    public void setRef(String ref) { this.ref = ref; }

    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }

    public String getVendor() { return vendor; }
    public void setVendor(String vendor) { this.vendor = vendor; }

    public String getService() { return service; }
    public void setService(String service) { this.service = service; }

    public LocalDate getEventDate() { return eventDate; }
    public void setEventDate(LocalDate eventDate) { this.eventDate = eventDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getTotal() { return total; }
    public void setTotal(String total) { this.total = total; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
}