package com.nelioalves.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.workshopmongo.domain.User;

//utilizando Spring Data

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	//O objeto UserRepository  ja consegue a partir desse momento fazer as operações basicas 
}
