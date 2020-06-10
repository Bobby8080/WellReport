package com.tphy.service.impl;

import com.tphy.entity.Doctor;
import com.tphy.mapper.DoctorMapper;
import com.tphy.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public Doctor findAll(Integer ysdm) {
        return doctorMapper.selectByPrimaryKey(ysdm);
    }
}
