package com.topzson_api.SpringBootMongoDB.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.topzson_api.SpringBootMongoDB.model.Tutorial;

import reactor.core.publisher.Flux;

@Repository
public interface TutorialRepository extends ReactiveMongoRepository<Tutorial, String> {
  Flux<Tutorial> findByPublished(boolean published);

  Flux<Tutorial> findByTitleContaining(String title);
}
