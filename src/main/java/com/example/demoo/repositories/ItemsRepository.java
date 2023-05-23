package com.example.demoo.repositories;

import com.example.demoo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

/**
 * @author Vitaly Chekushkin
 */

@Repository
@RestResource(path = "items")
public interface ItemsRepository extends JpaRepository<Item, Long> {
}
