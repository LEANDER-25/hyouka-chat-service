package com.hyouka.demo.hyoukachatting.repository.impl;

import com.hyouka.demo.hyoukachatting.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.util.List;
import java.util.Optional;

public class BaseRepositoryImpl<T, I> extends SimpleMongoRepository<T, I> implements BaseRepository<T, I> {
    public BaseRepositoryImpl(MongoEntityInformation<T, I> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
    }

    @Override
    public Page<T> findAll(Query query, Pageable pageable) {
        return null;
    }

    @Override
    public List<T> findAll(Query query) {
        return null;
    }

    @Override
    public Optional<T> findOne(Query query) {
        return Optional.empty();
    }
}
