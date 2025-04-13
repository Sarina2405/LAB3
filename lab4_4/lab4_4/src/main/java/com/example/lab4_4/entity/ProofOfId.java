package com.example.lab4_4.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUST_POI")
@IdClass(ProofOfId.class)
public class ProofOfId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "CST_ID")
    private Long customerId;

    @Id
    @Column(name = "CSTPOI_CLS_ID")
    private Long classificationId;

    @Column(name = "CSTPOI_VALUE", length = 100)
    private String value;

    @Column(name = "CSTPOI_START")
    private Date startDate;

    @Column(name = "CSTPOI_END")
    private Date endDate;

    @Column(name = "CSTPOI_EFCTV_DATE")
    private Date effectiveDate;

    @Column(name = "CSTPOI_CRUD_VALUE", length = 1)
    private char crudValue;

    @Column(name = "CSTPOI_USER_ID", length = 100)
    private String userId;

    @Column(name = "CSTPOI_WS_ID", length = 100)
    private String workstationId;

    @Column(name = "CSTPOI_PRGM_ID", length = 100)
    private String programId;

    @Column(name = "CSTPOI_UUID", length = 100)
    private UUID uuid;

    @Column(name = "cstpoi_host_ts")
    private byte[] hostTimestamp;

    @Column(name = "cstpoi_local_ts")
    private byte[] localTimestamp;

    @Column(name = "cstpoi_acpt_ts")
    private byte[] acceptedTimestamp;

    @Column(name = "cstpoi_acpt_ts_utc_ofst")
    private byte[] acceptedTimestampUtcOffset;

    // ✅ Default Constructor
    public ProofOfId() {}

    // ✅ Parameterized Constructor
    public ProofOfId(Long customerId, Long classificationId) {
        this.customerId = customerId;
        this.classificationId = classificationId;
    }

    // ✅ Getters and Setters
    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public Long getClassificationId() { return classificationId; }
    public void setClassificationId(Long classificationId) { this.classificationId = classificationId; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public Date getEffectiveDate() { return effectiveDate; }
    public void setEffectiveDate(Date effectiveDate) { this.effectiveDate = effectiveDate; }

    public char getCrudValue() { return crudValue; }
    public void setCrudValue(char crudValue) { this.crudValue = crudValue; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getWorkstationId() { return workstationId; }
    public void setWorkstationId(String workstationId) { this.workstationId = workstationId; }

    public String getProgramId() { return programId; }
    public void setProgramId(String programId) { this.programId = programId; }

    public UUID getUuid() { return uuid; }
    public void setUuid(UUID uuid) { this.uuid = uuid; }

    public byte[] getHostTimestamp() { return hostTimestamp; }
    public void setHostTimestamp(byte[] hostTimestamp) { this.hostTimestamp = hostTimestamp; }

    public byte[] getLocalTimestamp() { return localTimestamp; }
    public void setLocalTimestamp(byte[] localTimestamp) { this.localTimestamp = localTimestamp; }

    public byte[] getAcceptedTimestamp() { return acceptedTimestamp; }
    public void setAcceptedTimestamp(byte[] acceptedTimestamp) { this.acceptedTimestamp = acceptedTimestamp; }

    public byte[] getAcceptedTimestampUtcOffset() { return acceptedTimestampUtcOffset; }
    public void setAcceptedTimestampUtcOffset(byte[] acceptedTimestampUtcOffset) {
        this.acceptedTimestampUtcOffset = acceptedTimestampUtcOffset;
    }
}
