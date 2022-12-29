package com.ClientManagement.domain.service;


import com.ClientManagement.domain.dto.SellerDTO;
import com.ClientManagement.domain.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SellerService {

    @Autowired
    SellerRepository sellerRepository;

    public List<SellerDTO> getAll(){
        return sellerRepository.getAll();
    }
    public Optional<List<SellerDTO>> getBySeller(int sellerId){
        return sellerRepository.getBySeller(sellerId);
    }
    public Optional<SellerDTO> getSeller(int sellerId){
        return sellerRepository.getSeller(sellerId);
    }
    public SellerDTO save (SellerDTO seller){
        return sellerRepository.save(seller);
    }

    public SellerDTO update(SellerDTO seller){
        return sellerRepository.update(seller);
    }
    public boolean delete(int sellerId){
        if (getSeller(sellerId).isPresent()){
            sellerRepository.delete(sellerId);
            return true;
        }else {
            return false;
        }
    }

}
