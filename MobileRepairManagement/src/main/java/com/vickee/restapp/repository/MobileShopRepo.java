package com.vickee.restapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.MobileShop;

@Repository
public interface MobileShopRepo extends JpaRepository<MobileShop, Integer> {

}
