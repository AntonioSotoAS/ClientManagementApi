package com.ClientManagement.domain.repository;



import com.ClientManagement.domain.dto.BrandDTO;

import java.util.List;
import java.util.Optional;

public interface BrandRepository {

    List<BrandDTO> getAll();
    Optional<List<BrandDTO>> getByBrand(int brandId);
    Optional<BrandDTO> getBrand(int brandId);
    BrandDTO save (BrandDTO brand);
    BrandDTO update(BrandDTO brand);
    void delete(int brandId);

}
