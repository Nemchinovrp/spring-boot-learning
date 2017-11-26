package ru.example.nemchinovr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int countAccounts(){
        return jdbcTemplate.queryForObject("Select max(id) from account", Integer.class);
    }
}
