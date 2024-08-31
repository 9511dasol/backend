package com.example.demo.dao;
import com.example.demo.model.Epps;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface EppsDAO {

    Epps findById(int id);

    List<Epps> findAll();

    void insert(Epps epps);

    void update(Epps epps);

    void delete(int id);
}
