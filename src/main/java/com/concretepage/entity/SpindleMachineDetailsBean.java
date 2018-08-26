package com.concretepage.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;
@Entity
@Table(name="machine_details")
public class SpindleMachineDetailsBean implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idmachine_details")
    private long machineId;
    @Column(name="machine_name")
    private String machineName;
    @Column(name="spindle_name")
    private String spindleName;
    @Column(name="mean")
    private String mean;
    @Column(name="CV_percentage")
    private String cvPercentage;

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getMachineId() {
        return machineId;
    }


    public String getSpindleName() {
        return spindleName;
    }

    public void setSpindleName(String spindleName) {
        this.spindleName = spindleName;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String getCvPercentage() {
        return cvPercentage;
    }

    public void setCvPercentage(String cvPercentage) {
        this.cvPercentage = cvPercentage;
    }
}