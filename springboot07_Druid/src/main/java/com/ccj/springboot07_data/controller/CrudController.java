package com.ccj.springboot07_data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class CrudController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/select")
    public Map<String,Object> selectOne(){
        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from users");
        return list.get(0);
    }

}
