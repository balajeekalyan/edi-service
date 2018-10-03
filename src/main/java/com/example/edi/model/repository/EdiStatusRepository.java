package com.example.edi.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.edi.model.EdiStatus;

public interface EdiStatusRepository extends MongoRepository<EdiStatus, String>{

}
