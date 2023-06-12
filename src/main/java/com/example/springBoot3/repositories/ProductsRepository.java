package com.example.springBoot3.repositories;

import com.example.springBoot3.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ProductsRepository  extends JpaRepository<ProductModel, UUID> {
}
