package com.example.jpamapping.repository;

import com.example.jpamapping.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository<Item,Integer> {
}
