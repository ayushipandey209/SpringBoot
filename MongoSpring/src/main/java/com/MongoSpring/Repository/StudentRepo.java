package com.MongoSpring.Repository;

import com.MongoSpring.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student , Integer> {

}
