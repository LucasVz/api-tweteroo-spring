package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.api.model.Tweets;

public interface TweetsRepository extends JpaRepository<Tweets, Long> {

}
