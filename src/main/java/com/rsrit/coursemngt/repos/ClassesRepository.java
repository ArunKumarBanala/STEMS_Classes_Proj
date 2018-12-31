package com.rsrit.coursemngt.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsrit.coursemngt.model.Classes;

@Repository
public interface ClassesRepository extends JpaRepository<Classes, Integer> {

}
