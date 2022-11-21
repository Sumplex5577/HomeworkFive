package com.example.homeworkfive.converters;

import com.example.homeworkfive.dtos.ContactInfoDto;
import com.example.homeworkfive.models.ContactInfo;

public class ContactInfoConverter {

    public static ContactInfo convertContactInfoDtoToContactInfo(ContactInfoDto dto) {
        ContactInfo contactInfo = new ContactInfo();
        contactInfo.setFirstName(dto.getFirstName());
        contactInfo.setLastName(dto.getLastName());
        contactInfo.setPhoneNumber(dto.getPhoneNumber());
        contactInfo.setAge(dto.getAge());
        contactInfo.setAddress(dto.getAddress());
        contactInfo.setAddressId(dto.getAddressId());
        return contactInfo;
    }

    public static ContactInfoDto convertContactInfoToContactInfoDto(ContactInfo ci) {
        ContactInfoDto dto = new ContactInfoDto();
        dto.setId(ci.getId());
        dto.setFirstName(ci.getFirstName());
        dto.setLastName(ci.getLastName());
        dto.setPhoneNumber(ci.getPhoneNumber());
        dto.setAge(ci.getAge());
        dto.setAddress(ci.getAddress());
        dto.setAddressId(ci.getAddressId());
        return dto;
    }
}
