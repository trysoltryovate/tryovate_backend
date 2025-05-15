package com.tryovate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data

@Entity
@Table(name = "Candidate")
public class Candidate {

    @Id
    private String id;

    @Column(name = "full Name")
    private String fullName;

    @Column(name = "DOB")
    private String dob;
    ;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Contact Number",unique = true, nullable = false)
    private String contactNumber;

    @Column(name = "Email", unique = true, nullable = false)
    private String email;

    @Column(name = "Current Address")
    private String currentAddress;

    @Column(name = "permanent Address")
    private String permanentAddress;

    @Column(name = "Mother Name")
    private String motherName;

    @Column(name = "Father Name")
    private String fatherName;

    @Column(name = "Alternate Number")
    private String alternateNumber;

    @Column(name = "Aadhar Card",unique = true, nullable = false)
    private String aadharCard;

    @Column(name = "Pan Card",unique = true, nullable = false)
    private String panCard;

    @Column(name = "Reference Name")
    private String reference;

    private String degree;

    private String universityCollegeName;

    private int yearOfPassing;

    private String specializationMajor;

    private String percentageCgpa;

    private String highestDegree;

    private String pgUniversityCollegeName;

    private int pgYearOfPassing;

    private String pgSpecializationMajor;

    private double pgPercentageCgpa;

    private String longMemo;

    private String selectedCourse;

    private String batchId;

    private String paymentType;

    private String paymentMode;

    private double fullPaidAmount;

    private double fullAmountInPartialMode;


    private double partialPaidAmount;

    private double totalPayableAmount;

    private double remainingAmount;

    private double gstAmount;

    private String gstPercent;


    public Candidate() {
    }

    public Candidate(String id, String fullName, String dob, String gender, String contactNumber, String email, String currentAddress, String permanentAddress, String motherName, String fatherName, String alternateNumber, String aadharCard, String panCard, String reference, String degree, String universityCollegeName, int yearOfPassing, String specializationMajor, String percentageCgpa, String highestDegree, String pgUniversityCollegeName, int pgYearOfPassing, String pgSpecializationMajor, double pgPercentageCgpa, String longMemo, String selectedCourse, String batchId, String paymentType, String paymentMode, double fullPaidAmount, double fullAmountInPartialMode, double partialPaidAmount, double totalPayableAmount, double remainingAmount, double gstAmount, String gstPercent) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.email = email;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.alternateNumber = alternateNumber;
        this.aadharCard = aadharCard;
        this.panCard = panCard;
        this.reference = reference;
        this.degree = degree;
        this.universityCollegeName = universityCollegeName;
        this.yearOfPassing = yearOfPassing;
        this.specializationMajor = specializationMajor;
        this.percentageCgpa = percentageCgpa;
        this.highestDegree = highestDegree;
        this.pgUniversityCollegeName = pgUniversityCollegeName;
        this.pgYearOfPassing = pgYearOfPassing;
        this.pgSpecializationMajor = pgSpecializationMajor;
        this.pgPercentageCgpa = pgPercentageCgpa;
        this.longMemo = longMemo;
        this.selectedCourse = selectedCourse;
        this.batchId = batchId;
        this.paymentType = paymentType;
        this.paymentMode = paymentMode;
        this.fullPaidAmount = fullPaidAmount;
        this.fullAmountInPartialMode = fullAmountInPartialMode;
        this.partialPaidAmount = partialPaidAmount;
        this.totalPayableAmount = totalPayableAmount;
        this.remainingAmount = remainingAmount;
        this.gstAmount = gstAmount;
        this.gstPercent = gstPercent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAlternateNumber() {
        return alternateNumber;
    }

    public void setAlternateNumber(String alternateNumber) {
        this.alternateNumber = alternateNumber;
    }

    public String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getUniversityCollegeName() {
        return universityCollegeName;
    }

    public void setUniversityCollegeName(String universityCollegeName) {
        this.universityCollegeName = universityCollegeName;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public String getSpecializationMajor() {
        return specializationMajor;
    }

    public void setSpecializationMajor(String specializationMajor) {
        this.specializationMajor = specializationMajor;
    }

    public String getPercentageCgpa() {
        return percentageCgpa;
    }

    public void setPercentageCgpa(String percentageCgpa) {
        this.percentageCgpa = percentageCgpa;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getPgUniversityCollegeName() {
        return pgUniversityCollegeName;
    }

    public void setPgUniversityCollegeName(String pgUniversityCollegeName) {
        this.pgUniversityCollegeName = pgUniversityCollegeName;
    }

    public int getPgYearOfPassing() {
        return pgYearOfPassing;
    }

    public void setPgYearOfPassing(int pgYearOfPassing) {
        this.pgYearOfPassing = pgYearOfPassing;
    }

    public String getPgSpecializationMajor() {
        return pgSpecializationMajor;
    }

    public void setPgSpecializationMajor(String pgSpecializationMajor) {
        this.pgSpecializationMajor = pgSpecializationMajor;
    }

    public double getPgPercentageCgpa() {
        return pgPercentageCgpa;
    }

    public void setPgPercentageCgpa(double pgPercentageCgpa) {
        this.pgPercentageCgpa = pgPercentageCgpa;
    }

    public String getLongMemo() {
        return longMemo;
    }

    public void setLongMemo(String longMemo) {
        this.longMemo = longMemo;
    }

    public String getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(String selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public double getFullPaidAmount() {
        return fullPaidAmount;
    }

    public void setFullPaidAmount(double fullPaidAmount) {
        this.fullPaidAmount = fullPaidAmount;
    }

    public double getFullAmountInPartialMode() {
        return fullAmountInPartialMode;
    }

    public void setFullAmountInPartialMode(double fullAmountInPartialMode) {
        this.fullAmountInPartialMode = fullAmountInPartialMode;
    }

    public double getPartialPaidAmount() {
        return partialPaidAmount;
    }

    public void setPartialPaidAmount(double partialPaidAmount) {
        this.partialPaidAmount = partialPaidAmount;
    }

    public double getTotalPayableAmount() {
        return totalPayableAmount;
    }

    public void setTotalPayableAmount(double totalPayableAmount) {
        this.totalPayableAmount = totalPayableAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public double getGstAmount() {
        return gstAmount;
    }

    public void setGstAmount(double gstAmount) {
        this.gstAmount = gstAmount;
    }

    public String getGstPercent() {
        return gstPercent;
    }

    public void setGstPercent(String gstPercent) {
        this.gstPercent = gstPercent;
    }
}