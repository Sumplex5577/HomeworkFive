package com.example.homeworkfive;

import com.example.homeworkfive.controllers.AddressController;
import com.example.homeworkfive.controllers.ContactInfoController;
import com.example.homeworkfive.db_connectors.DatabaseConnector;
import com.example.homeworkfive.db_connectors.H2DatabaseConnector;
import com.example.homeworkfive.repositories.AddressRepository;
import com.example.homeworkfive.repositories.ContactInfoRepository;
import com.example.homeworkfive.services.AddressService;
import com.example.homeworkfive.services.AddressServiceImpl;
import com.example.homeworkfive.services.ContactInfoService;
import com.example.homeworkfive.services.ContactInfoServiceImpl;



public class HomeworkFiveApplication {

    public static void main(String[] args) {
        DatabaseConnector databaseConnector = new H2DatabaseConnector();
        AddressService addressService = new AddressServiceImpl(
                new AddressRepository(databaseConnector));
        AddressController addressController = new AddressController(addressService);

        ContactInfoService contactInfoService = new ContactInfoServiceImpl(
                new ContactInfoRepository(databaseConnector, addressService));
        ContactInfoController contactInfoController = new ContactInfoController(contactInfoService);


        System.out.println(addressController.getAllAddresses());
//        System.out.println(addressController.getAddressById());
        addressController.addAddress();
//        addressController.deleteAddressById();
//        addressController.updateCountryById();
        System.out.println(addressController.getAllAddresses());

        System.out.println(contactInfoController.getAllContacts());
        contactInfoController.addContact();
        contactInfoController.getContactById();
        contactInfoController.deleteContactById();
        contactInfoController.updateFirstNameById();
        contactInfoController.updateAddressIdById();
        System.out.println(contactInfoController.getContactById());
        System.out.println(contactInfoController.getAllContacts());
    }
}
