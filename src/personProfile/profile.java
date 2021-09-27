/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personProfile;

import java.awt.Image;

/**
 *
 * @author pradyumnareddy
 */
public class profile {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_of_birth() {
        return Date_of_birth;
    }

    public void setDob(String dob) {
        this.Date_of_birth = dob;
    }

    public long getTelephone_number() {
        return Telephone_number;
    }

    public void setTelephone_number(long Telephone_number) {
        this.Telephone_number = Telephone_number;
    }

    public long getFax_number() {
        return Fax_number;
    }

    public void setFax_number(long Fax_number) {
        this.Fax_number = Fax_number;
    }

    public String getEmail_address() {
        return Email_address;
    }

    public void setEmail_address(String Email_address) {
        this.Email_address = Email_address;
    }

    public long getSocial_Security_Number() {
        return Social_Security_Number;
    }

    public void setSocial_Security_Number(long Social_Security_Number) {
        this.Social_Security_Number = Social_Security_Number;
    }

    public String getMedical_Record_Number() {
        return Medical_Record_Number;
    }

    public void setMedical_Record_Number(String Medical_Record_Number) {
        this.Medical_Record_Number = Medical_Record_Number;
    }

    public long getHealth_plan_benificiary_number() {
        return Health_plan_benificiary_number;
    }

    public void setHealth_plan_benificiary_number(long Health_plan_benificiary_number) {
        this.Health_plan_benificiary_number = Health_plan_benificiary_number;
    }

    public long getBank_account_number() {
        return Bank_account_number;
    }

    public void setBank_account_number(long Bank_account_number) {
        this.Bank_account_number = Bank_account_number;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getVehicle_Identifier_licence_plate() {
        return Vehicle_Identifier_licence_plate;
    }

    public void setVehicle_Identifier_licence_plate(String Vehicle_Identifier_licence_plate) {
        this.Vehicle_Identifier_licence_plate = Vehicle_Identifier_licence_plate;
    }

    public String getDevice_Identifiers() {
        return Device_Identifiers;
    }

    public void setDevice_Identifiers(String Device_Identifiers) {
        this.Device_Identifiers = Device_Identifiers;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getInternet_protocol_address() {
        return Internet_protocol_address;
    }

    public void setInternet_protocol_address(String Internet_protocol_address) {
        this.Internet_protocol_address = Internet_protocol_address;
    }

    public String getBiometric_identifiers() {
        return Biometric_identifiers;
    }

    public void setBiometric_identifiers(String Biometric_identifiers) {
        this.Biometric_identifiers = Biometric_identifiers;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public long getUnique() {
        return unique;
    }

    public void setUnique(long unique) {
        this.unique = unique;
    }

    public String getGeographic_data() {
        return Geographic_data;
    }

    public void setGeographic_data(String Geographic_data) {
        this.Geographic_data = Geographic_data;
    }
    private String Date_of_birth;
    private String Geographic_data;
    private long Telephone_number;
    private long Fax_number;
    private String Email_address;
    private long Social_Security_Number;
    private String Medical_Record_Number;
    private long Health_plan_benificiary_number;
    private long Bank_account_number;
    private String license_number;
    private String Vehicle_Identifier_licence_plate;
    private String Device_Identifiers;
    private String LinkedIn;
    private String Internet_protocol_address;
    private String Biometric_identifiers;
    private String Photo;
    private long unique;
    
    private Image Img;

    public Image getImg() {
        return Img;
    }

    public void setImg(Image Img) {
        this.Img = Img;
    }
    
    
  
    
}
