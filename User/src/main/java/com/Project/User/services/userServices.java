package com.Project.User.services;


import com.Project.User.classes.School;
import com.Project.User.classes.University;
import com.Project.User.entity.User;
import com.Project.User.repo.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;



@Service
public class userServices {
    private userRepo repo;
    private WebClient webClient;

    @Autowired
    public userServices(userRepo repo,WebClient webClient) {
        this.repo = repo;
        this.webClient = webClient;
    }

    public Mono<User> saveUser(User user) {
         return repo.save(user);
    }

    public Mono<University> getAlldetails() {
      //  Mono<User> user = repo.findById(userId);


        return webClient
                .get()
                .uri("school/1")
                .retrieve()
                .bodyToMono(University.class)
                .flatMap(university->repo.save(university.getUser()).then(Mono.just(university)));


       /* University university=new University();
        university.setUser(user);
        university.setSchool(schools);
        return university;*/
    }
}



