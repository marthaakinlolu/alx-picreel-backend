package com.example.alx_project.Repository;

import com.example.alx_project.model.RegistrationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<RegistrationModel, Long> {
}
