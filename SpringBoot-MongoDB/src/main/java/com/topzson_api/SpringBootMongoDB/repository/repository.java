package com.topzson_api.SpringBootMongoDB.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.topzson_api.SpringBootMongoDB.model.model;

public interface repository extends MongoRepository<model, String> {
    List<model> findByTitleContaining(String title);
    List<model> findByPublished(boolean published);

}
