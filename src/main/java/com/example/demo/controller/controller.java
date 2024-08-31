package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.dao.EppsDAO;

import com.example.demo.model.Epps;
import java.util.List;

@RestController
public class controller {

    @Autowired
    EppsDAO eppsDAO;

    @GetMapping("/api/epps")
    public List<Epps> FindAll() {
        return eppsDAO.findAll();
    }
    @GetMapping("/api/epps/id")
    Epps findById(int id){
        return eppsDAO.findById(id);
    }
    @PostMapping("/api/epps/accession")
    void insert(Epps epps){
        eppsDAO.insert(epps);
    }

    @PutMapping("/api/epps/update")
    void update(Epps epps){
        eppsDAO.update(epps);
    }
    @DeleteMapping("/api/epps/delete/{id}")
    void delete(int id){
        eppsDAO.delete(id);
    }
}
