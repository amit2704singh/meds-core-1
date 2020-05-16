package com.meds.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meds.model.User;

@Repository
public interface RegistrationReoisitiry extends JpaRepository<User, Id> {

}
