package com.vinstonguillaume.rest_tutorial.repositories;

import com.vinstonguillaume.rest_tutorial.models.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetsRepository extends MongoRepository<Pets, String> {
    Pets findBy_id(ObjectId _id);
}