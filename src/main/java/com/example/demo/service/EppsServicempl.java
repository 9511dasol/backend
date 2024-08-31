package com.example.demo.service;

import com.example.demo.dao.EppsDAO;
import com.example.demo.model.Epps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EppsServicempl implements EppsService {
    @Autowired
    EppsDAO eppsDAO;

    @Override
    public List<Epps> findAll() {
        return eppsDAO.findAll();
    }
}
