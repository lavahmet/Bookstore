package com.mnb.service;

import com.mnb.entity.Author;
import com.mnb.entity.Publisher;

import java.util.List;

public interface PublisherService {
    List<Publisher> findAll();
    Publisher findById(int theId);
    void save(Publisher thePublisher);
    void deleteById(int theId);
}
