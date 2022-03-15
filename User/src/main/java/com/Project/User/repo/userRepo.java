package com.Project.User.repo;

import com.Project.User.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends ReactiveMongoRepository<User,String> {
}
