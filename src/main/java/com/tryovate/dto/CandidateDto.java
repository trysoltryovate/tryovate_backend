package com.tryovate.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter @Setter
public class CandidateDto {

    private String id;

    @NotBlank(message = "Full name is required")
    @Size(min = 3, max = 30, message = "The length of the candidate name should be between 5 and 30")
    private String fullName;

    @NotBlank(message = "Gender is required")
    private String dob;
    ;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "Contact number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid contact number")
    private String contactNumber;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Current address is required")
    private String currentAddress;


    private String permanentAddress;

    @NotBlank(message = "Mother's name is required")
    private String motherName;

    @NotBlank(message = "Father's name is required")
    private String fatherName;


    @NotBlank(message = "Contact number is required")
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid contact number")
    private String alternateNumber;

    @NotBlank(message = "Aadhar card number is required")
    @Pattern(regexp = "^\\d{12}$", message = "Invalid Aadhar number")
    private String aadharCard;

    @NotBlank(message = "PAN card number is required")
    @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]$", message = "Invalid PAN number")
    private String panCard;

    private String reference;

    @NotBlank(message = "degree is required")
    private String degree;

    @NotBlank(message = "university/CollegeName is required")
    private String universityCollegeName;

    @NotNull(message = "Year of passing is required")
    private int yearOfPassing;

    @NotBlank(message = "Specialization is required")
    private String specializationMajor;

    @NotNull(message = "Percentage/CGPA is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Percentage must be greater than 0")
    private String percentageCgpa;

    private String highestDegree;

    private String pgUniversityCollegeName;

    private int pgYearOfPassing;

    private String pgSpecializationMajor;

    private double pgPercentageCgpa;

////    @NotBlank(message = "Highest degree is required")
//    private String highestDegree;
//
////    @NotBlank(message = "University/College name is required")
//    private String universityCollegeName;
//
////    @NotNull(message = "Year of passing is required")
//    private int yearOfPassing;
//
////    @NotBlank(message = "Specialization is required")
//    private String specializationMajor;
//
////    @NotNull(message = "Percentage/CGPA is required")
////    @DecimalMin(value = "0.0", inclusive = false, message = "Percentage must be greater than 0")
//    private double percentageCgpa;

    private String longMemo;

    @NotNull(message = "Selected courses must not be null")
    @Size(min = 1, message = "At least one course must be selected")
    private List<String> selectedCourse;

    private String batchId;

    @NotBlank(message = "Payment type is required")
    private String paymentType; // FULL or PARTIAL

    @NotBlank(message = "Payment mode is required")
    private String paymentMode;// ONLINE or OFFLINE


    private double fullPaidAmount;

    private double fullAmountInPartialMode;

    @NotNull(message = "Partial paid amount is required")
    @PositiveOrZero(message = "Partial paid amount must be zero or positive")
    private double partialPaidAmount; // optional for partial payments

    @NotNull(message = "Total payable amount is required")
    @Positive(message = "Total payable amount must be greater than zero")
    private Double totalPayableAmount;

    private double remainingAmount;
    private double gstAmount;

    private String gstPercent;


    public CandidateDto() {
    }

    public CandidateDto(String id, String fullName, String dob, String gender, String contactNumber, String email, String currentAddress, String permanentAddress, String motherName, String fatherName, String alternateNumber, String aadharCard, String panCard, String reference, String degree, String universityCollegeName, int yearOfPassing, String specializationMajor, String percentageCgpa, String highestDegree, String pgUniversityCollegeName, int pgYearOfPassing, String pgSpecializationMajor, double pgPercentageCgpa, String longMemo, List<String> selectedCourse, String batchId, String paymentType, String paymentMode, double fullPaidAmount, double fullAmountInPartialMode, double partialPaidAmount, Double totalPayableAmount, double remainingAmount, double gstAmount, String gstPercent) {
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

    public @NotBlank(message = "Full name is required") @Size(min = 3, max = 30, message = "The length of the candidate name should be between 5 and 30") String getFullName() {
        return fullName;
    }

    public void setFullName(@NotBlank(message = "Full name is required") @Size(min = 3, max = 30, message = "The length of the candidate name should be between 5 and 30") String fullName) {
        this.fullName = fullName;
    }

    public @NotBlank(message = "Gender is required") String getDob() {
        return dob;
    }

    public void setDob(@NotBlank(message = "Gender is required") String dob) {
        this.dob = dob;
    }

    public @NotBlank(message = "Gender is required") String getGender() {
        return gender;
    }

    public void setGender(@NotBlank(message = "Gender is required") String gender) {
        this.gender = gender;
    }

    public @NotBlank(message = "Contact number is required") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid contact number") String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(@NotBlank(message = "Contact number is required") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid contact number") String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Invalid email format") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Invalid email format") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Current address is required") String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(@NotBlank(message = "Current address is required") String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public @NotBlank(message = "Mother's name is required") String getMotherName() {
        return motherName;
    }

    public void setMotherName(@NotBlank(message = "Mother's name is required") String motherName) {
        this.motherName = motherName;
    }

    public @NotBlank(message = "Father's name is required") String getFatherName() {
        return fatherName;
    }

    public void setFatherName(@NotBlank(message = "Father's name is required") String fatherName) {
        this.fatherName = fatherName;
    }

    public @NotBlank(message = "Contact number is required") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid contact number") String getAlternateNumber() {
        return alternateNumber;
    }

    public void setAlternateNumber(@NotBlank(message = "Contact number is required") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid contact number") String alternateNumber) {
        this.alternateNumber = alternateNumber;
    }

    public @NotBlank(message = "Aadhar card number is required") @Pattern(regexp = "^\\d{12}$", message = "Invalid Aadhar number") String getAadharCard() {
        return aadharCard;
    }

    public void setAadharCard(@NotBlank(message = "Aadhar card number is required") @Pattern(regexp = "^\\d{12}$", message = "Invalid Aadhar number") String aadharCard) {
        this.aadharCard = aadharCard;
    }

    public @NotBlank(message = "PAN card number is required") @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]$", message = "Invalid PAN number") String getPanCard() {
        return panCard;
    }

    public void setPanCard(@NotBlank(message = "PAN card number is required") @Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]$", message = "Invalid PAN number") String panCard) {
        this.panCard = panCard;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public @NotBlank(message = "degree is required") String getDegree() {
        return degree;
    }

    public void setDegree(@NotBlank(message = "degree is required") String degree) {
        this.degree = degree;
    }

    public @NotBlank(message = "university/CollegeName is required") String getUniversityCollegeName() {
        return universityCollegeName;
    }

    public void setUniversityCollegeName(@NotBlank(message = "university/CollegeName is required") String universityCollegeName) {
        this.universityCollegeName = universityCollegeName;
    }

    @NotNull(message = "Year of passing is required")
    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(@NotNull(message = "Year of passing is required") int yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    public @NotBlank(message = "Specialization is required") String getSpecializationMajor() {
        return specializationMajor;
    }

    public void setSpecializationMajor(@NotBlank(message = "Specialization is required") String specializationMajor) {
        this.specializationMajor = specializationMajor;
    }

    public @NotNull(message = "Percentage/CGPA is required") @DecimalMin(value = "0.0", inclusive = false, message = "Percentage must be greater than 0") String getPercentageCgpa() {
        return percentageCgpa;
    }

    public void setPercentageCgpa(@NotNull(message = "Percentage/CGPA is required") @DecimalMin(value = "0.0", inclusive = false, message = "Percentage must be greater than 0") String percentageCgpa) {
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

    public @NotNull(message = "Selected courses must not be null") @Size(min = 1, message = "At least one course must be selected") List<String> getSelectedCourse() {
        return selectedCourse;
    }

    public void setSelectedCourse(@NotNull(message = "Selected courses must not be null") @Size(min = 1, message = "At least one course must be selected") List<String> selectedCourse) {
        this.selectedCourse = selectedCourse;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public @NotBlank(message = "Payment type is required") String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(@NotBlank(message = "Payment type is required") String paymentType) {
        this.paymentType = paymentType;
    }

    public @NotBlank(message = "Payment mode is required") String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(@NotBlank(message = "Payment mode is required") String paymentMode) {
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

    @NotNull(message = "Partial paid amount is required")
    @PositiveOrZero(message = "Partial paid amount must be zero or positive")
    public double getPartialPaidAmount() {
        return partialPaidAmount;
    }

    public void setPartialPaidAmount(@NotNull(message = "Partial paid amount is required") @PositiveOrZero(message = "Partial paid amount must be zero or positive") double partialPaidAmount) {
        this.partialPaidAmount = partialPaidAmount;
    }

    public @NotNull(message = "Total payable amount is required") @Positive(message = "Total payable amount must be greater than zero") Double getTotalPayableAmount() {
        return totalPayableAmount;
    }

    public void setTotalPayableAmount(@NotNull(message = "Total payable amount is required") @Positive(message = "Total payable amount must be greater than zero") Double totalPayableAmount) {
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