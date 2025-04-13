package com.example.lab4_1.entity;

import java.sql.Timestamp;
import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "CUST_DETAILS")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CST_ID")
    private Long id;

    @Column(name = "CSTDET_TYPE")
    private String type;

    @Temporal(TemporalType.DATE)
    @Column(name = "CSTDET_DOB")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @Column(name = "CSTDET_STATUS")
    private String status;

    @Column(name = "CSTDET_CONTACT")
    private String contact;

    @Column(name = "CSTDET_MOBILE")
    private String mobile;

    @Column(name = "CSTDET_EMAIL")
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "CSTDET_EFCTV_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date effectiveDate;

    @Column(name = "CSTDET_CRUD_VALUE", length = 1)
    private String crudValue;

    @Column(name = "CSTDET_USER_ID")
    private String userId;

    @Column(name = "CSTDET_WS_ID")
    private String wsId;

    @Column(name = "CSTDET_PRGM_ID")
    private String programId;

    @Column(name = "CSTDET_HOST_TS", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp hostTimestamp;

    @Column(name = "CSTDET_LOCAL_TS", nullable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp localTimestamp;

    @Column(name = "CSTDET_ACPT_TS")
    private Timestamp acceptedTimestamp;

    @Column(name = "CSTDET_ACPT_TS_UTC_OFST")
    private Timestamp acceptedTimestampUtcOffset;

    @Column(name = "CSTDET_UUID")
    private String uuid;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getCrudValue() {
        return crudValue;
    }

    public void setCrudValue(String crudValue) {
        this.crudValue = crudValue;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWsId() {
        return wsId;
    }

    public void setWsId(String wsId) {
        this.wsId = wsId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public Timestamp getHostTimestamp() {
        return hostTimestamp;
    }

    public Timestamp getLocalTimestamp() {
        return localTimestamp;
    }

    public Timestamp getAcceptedTimestamp() {
        return acceptedTimestamp;
    }

    public void setAcceptedTimestamp(Timestamp acceptedTimestamp) {
        this.acceptedTimestamp = acceptedTimestamp;
    }

    public Timestamp getAcceptedTimestampUtcOffset() {
        return acceptedTimestampUtcOffset;
    }

    public void setAcceptedTimestampUtcOffset(Timestamp acceptedTimestampUtcOffset) {
        this.acceptedTimestampUtcOffset = acceptedTimestampUtcOffset;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
