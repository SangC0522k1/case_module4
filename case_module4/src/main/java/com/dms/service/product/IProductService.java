package com.dms.service.product;

import com.dms.model.Product;
import com.dms.model.dto.ProductDTO;
import com.dms.service.IGeneralService;

import java.util.List;
import java.util.Optional;

public interface IProductService extends IGeneralService<Product> {
    List<ProductDTO> findAllProductDTO();

    Optional<ProductDTO> findProductDTOById(Long id);

    void deleteProductById(Long id);

    void softDelete(Product product);

    List<ProductDTO> findProductByValue(String query);
}
