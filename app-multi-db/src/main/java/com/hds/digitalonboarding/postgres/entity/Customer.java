package com.hds.digitalonboarding.postgres.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * A Customer for DDE Web
 */
@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "national_id")
    private String nationalId;

    @Column(name = "national_issued_date")
    private Date nationalIssuedDate;
    
    @Column(name = "national_expiry_date")
    private Date nationalExpiryDate;

    @Column(name = "old_national_id")
    private String oldNationalId;
    
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "national_frontside_image_url")
    private String nationalFrontsideImageUrl;

    @Column(name = "national_backside_image_url")
    private String nationalBacksideImageUrl;

    @Column(name = "personal_image_url")
    private String personalImageUrl;

    @Column(name = "sex")
    private String sex;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "educational_level")
    private String educationalLevel;

    @Column(name = "profession")
    private String profession;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_address")
    private String companyAddress;

    @Column(name = "income")
    private BigDecimal income;

    @Column(name = "total_income")
    private BigDecimal totalIncome;

    @Column(name = "company_phone_number")
    private String companyPhoneNumber = "0";

    @Column(name = "dependent_number")
    private Integer dependentNumber = 2;

    @Column(name = "sale_reason")
    private String saleReason = "CTI-Customer Initiative";

    @Column(name = "family_book_address_house_number")
    private String familyBookAddressHouseNumber;

    @Column(name = "family_book_address_street")
    private String familyBookAddressStreet;

    @Column(name = "family_book_address_ward")
    private String familyBookAddressWard;

    @Column(name = "family_book_address_district")
    private String familyBookAddressDistrict;

    @Column(name = "family_book_address_province")
    private String familyBookAddressProvince;

    @Column(name = "family_book_address_owner_ship")
    private String familyBookAddressOwnerShip = "Y-House self owned";

    @Column(name = "temporary_resident_address_house_number")
    private String temporaryResidentAddressHouseNumber;

    @Column(name = "temporary_resident_address_street")
    private String temporaryResidentAddressStreet;

    @Column(name = "temporary_resident_address_ward")
    private String temporaryResidentAddressWard;

    @Column(name = "temporary_resident_address_district")
    private String temporaryResidentAddressDistrict;

    @Column(name = "temporary_resident_address_province")
    private String temporaryResidentAddressProvince;

    @Column(name = "temporary_resident_address_owner_ship")
    private String temporaryResidentAddressOwnerShip = "Y-House self owned";

    @Column(name = "spouse_borrower_name")
    private String spouseBorrowerName;

    @Column(name = "spouse_borrower_dob")
    private Date spouseBorrowerDob;

    @Column(name = "spouse_borrower_national_id")
    private String spouseBorrowerNationalId;

    @Column(name = "spouse_borrower_sex")
    private String spouseBorrowerSex;

    @Column(name = "relation_borrower_1_name")
    private String relationBorrower1Name;

    @Column(name = "relation_borrower_1_phone_number")
    private String relationBorrower1PhoneNumber;

    @Column(name = "relation_borrower_1_relationship")
    private String relationBorrower1Relationship;

    @Column(name = "relation_borrower_1_house_number")
    private String relationBorrower1HouseNumber;

    @Column(name = "relation_borrower_1_street")
    private String relationBorrower1Street;

    @Column(name = "relation_borrower_1_ward")
    private String relationBorrower1Ward;

    @Column(name = "relation_borrower_1_district")
    private String relationBorrower1District;

    @Column(name = "relation_borrower_1_province")
    private String relationBorrower1Province;

    @Column(name = "relation_borrower_1_owner_ship")
    private String relationBorrower1OwnerShip = "Y-House self owned";

    @Column(name = "relation_borrower_2_name")
    private String relationBorrower2Name;

    @Column(name = "relation_borrower_2_phone_number")
    private String relationBorrower2PhoneNumber;

    @Column(name = "relation_borrower_2_relationship")
    private String relationBorrower2Relationship;

    @Column(name = "relation_borrower_2_house_number")
    private String relationBorrower2HouseNumber;

    @Column(name = "relation_borrower_2_street")
    private String relationBorrower2Street;

    @Column(name = "relation_borrower_2_ward")
    private String relationBorrower2Ward;

    @Column(name = "relation_borrower_2_district")
    private String relationBorrower2District;

    @Column(name = "relation_borrower_2_province")
    private String relationBorrower2Province;

    @Column(name = "relation_borrower_2_owner_ship")
    private String relationBorrower2OwnerShip = "Y-House self owned";

    @Column(name = "driver_licence_number")
    private String driverLicenceNumber;

    @Column(name = "driver_licence_issued_date")
    private Date driverLicenceIssuedDate;

    @Column(name = "driver_licence_frontside_image_url")
    private String driverLicenceFrontsideImageUrl;

    @Column(name = "driver_licence_backside_image_url")
    private String driverLicenceBacksideImageUrl;

    @Column(name = "family_book_number")
    private String familyBookNumber;

    @Column(name = "family_book_image_urls")
    private String familyBookImageUrls;

    @Column(name = "proved_income_image_urls")
    private String provedIncomeImageUrls;

    @Column(name = "proved_home_image_urls")
    private String provedHomeImageUrls;

    @JsonIgnore
    @Column(name = "deleted")
    private Boolean deleted = false;

    @Column(name = "stamp")
    @JsonIgnore
    private Long stamp = 0L;

    @Column(name = "receipt_card_address_province")
    private String receiptCardAddressProvince;

    @Column(name = "receipt_card_address_district")
    private String receiptCardAddressDistrict;

    @Column(name = "receipt_card_address_ward")
    private String receiptCardAddressWard;

    @Column(name = "receipt_card_address_street")
    private String receiptCardAddressStreet;

    @Column(name = "receipt_card_address_house_number")
    private String receiptCardAddressHouseNumber;
    
	@Column(name = "consult_online")
	private Boolean hasConsultOnline = false;
}
