package com.example.lab4_3.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUST_CI")
public class CustomerContactInfromation {
	@Id
    @Column(name = "CST_ID")
    private Long customerId;
	
	@Column(name = "contact_detail", length = 100, nullable = false)
    private String contactDetail;

    @Column(name = "CSTDET_CONTACT_T",nullable = false, length = 50)
    private String contactType = "Unknown";

    @Column(name = "CSTDET_CONTACT_V", length = 100)
    private String contactValue;

    @Column(name = "CSTCL_EFCTV_DATE")
    private Date effectiveDate;

    @Column(name = "StartDate")
    private Date startDate;

    @Column(name = "EndDate")
    private Date endDate;

    // Getters and Setters
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactValue() {
        return contactValue;
    }

    public void setContactValue(String contactValue) {
        this.contactValue = contactValue;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setcontactDetail(String contactDetail) {
        this.contactDetail = contactDetail;
    }
    
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    public String getcontactDetail() {
        return contactDetail;
    }
    
}
