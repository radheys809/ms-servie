package com.example.addressservice.services.impls;

import com.example.addressservice.dto.AddressDto;
import com.example.addressservice.repositories.AddressRepository;
import com.example.addressservice.services.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepo;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public String getAddress() {
        return "Hanuman Vihar, Sector 49 Noida";
    }

    @Override
    public AddressDto getAddressById(long addressId) {

        return modelMapper.map(addressRepo.findById(addressId).get(),AddressDto.class);
    }
}
