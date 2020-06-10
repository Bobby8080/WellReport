package com.tphy.controller;

import com.tphy.entity.Doctor;
import com.tphy.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

/**
 * @Author: xwb
 * @Description: 从后台取出数据,返回给前台
 * @Date 19:15 2020/6/8
*/
@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/{ysdm}")
    public Doctor findAll(@PathVariable("ysdm") Integer ysdm){
        return doctorService.findAll(ysdm);
    }
}
