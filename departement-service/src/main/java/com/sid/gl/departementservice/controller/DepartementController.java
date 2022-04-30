package com.sid.gl.departementservice.controller;

import com.sid.gl.departementservice.entity.Departement;
import com.sid.gl.departementservice.service.DepartementService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departements")
@AllArgsConstructor
@Slf4j
public class DepartementController {
    private DepartementService service;

    @PostMapping
    public Departement save(@RequestBody Departement departement){
        log.info("departement saved");
        return service.saveDep(departement);
    }

    @GetMapping("/{id}")
    public Departement findDepById(@PathVariable("id") Long id){
        log.info("find one dep");
        return service.findDepById(id);
    }
}
