package com.hyouka.demo.hyoukachatting.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends MongoRepository<T, ID> {

    Page<T> findAll(Query query, Pageable pageable);
    List<T> findAll(Query query);
    Optional<T> findOne(Query query);
}
