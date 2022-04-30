package com.sid.gl.departementservice.service;

import com.sid.gl.departementservice.entity.Departement;
import com.sid.gl.departementservice.repository.DepartementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartementService {
    private DepartementRepository departementRepository;

    public Departement saveDep(Departement departement){
        return departementRepository.save(departement);
    }

    public Departement findDepById(Long departementId){
        return departementRepository.findById(departementId).get();
    }
}
