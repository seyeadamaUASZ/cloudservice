package com.sid.gl.departementservice.repository;

import com.sid.gl.departementservice.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
