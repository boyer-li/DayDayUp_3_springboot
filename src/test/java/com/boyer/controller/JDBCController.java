package com.boyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDBCController {

    @Autowired(required = false)
    JdbcTemplate jdbcTemplate;



}
