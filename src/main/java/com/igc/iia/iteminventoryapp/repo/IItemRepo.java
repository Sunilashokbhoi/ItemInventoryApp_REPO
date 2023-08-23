package com.igc.iia.iteminventoryapp.repo;

import com.igc.iia.iteminventoryapp.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepo extends JpaRepository<Item,Integer > {
}
