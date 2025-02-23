package com.crudpratices.crudpratices.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crudpratices.crudpratices.entiy.User;

public interface UserRepository extends MongoRepository<User, String> {

}
