package com.reece.reece_dtos_library.dto;

public class UserDTO {

    private String name;

    private String email;

    private String phone;

    private String cellPhone;

    private String city;

    public UserDTO(String name, String email, String phone, String cellPhone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.cellPhone = cellPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
