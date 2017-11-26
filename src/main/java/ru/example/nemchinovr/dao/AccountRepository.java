package ru.example.nemchinovr.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.example.nemchinovr.model.Account;


public interface AccountRepository extends CrudRepository<Account, Long> {
}
