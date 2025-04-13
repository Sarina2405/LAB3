package com.example.lab4_2.entity;

import java.sql.Date;
import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUST_ID")
public class CustomerIdentification {
	@Id

    @Column(name = "CST_ID")
    private Long id;

    @Column(name = "CUSTID_TYPE", length = 100)
    private String type;

    @Column(name = "CUSTID_ITEM", length = 100, unique = true)
    private String item;

    @Column(name = "CSTID_EFCTV_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date effectiveDate;

    @Column(name = "CSTID_CRUD_VALUE", length = 1)
    private String crudValue;

    @Column(name = "CSTID_USER_ID", length = 100)
    private String userId;

    @Column(name = "CSTID_WS_ID", length = 100)
    private String wsId;

    @Column(name = "CSTID_PRGM_ID", length = 100)
    private String programId;

    @Column(name = "CSTID_HOST_TS", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp hostTimestamp;

    @Column(name = "CSTID_LOCAL_TS", nullable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp localTimestamp;

    @Column(name = "CSTID_ACPT_TS")
    private Timestamp acceptedTimestamp;

    @Column(name = "CSTID_ACPT_TS_UTC_OFST")
    private Timestamp acceptedTimestampUtcOffset;

    @Column(name = "CSTID_UUID", length = 100)
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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
