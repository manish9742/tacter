package com.eapp.service.user.entity;


import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class License {


    private int id;
    private String productName;
    private String LicenseType;
    private  int organisationId;


}