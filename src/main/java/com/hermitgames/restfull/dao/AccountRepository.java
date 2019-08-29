package com.hermitgames.restfull.dao;

import com.hermitgames.restfull.bo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<User, Long> {
}

