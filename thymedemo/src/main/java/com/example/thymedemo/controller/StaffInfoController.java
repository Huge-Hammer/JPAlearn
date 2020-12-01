package com.example.thymedemo.controller;

import com.example.thymedemo.dao.StaffInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StaffInfoController {
    @Autowired
    StaffInfoDao staffInfoDao;

    @RequestMapping("/count")
    public String count(Model model){

        List<Object[]> data = staffInfoDao.findContent();
        model.addAttribute("data",data);

        return "count";
    }
}
