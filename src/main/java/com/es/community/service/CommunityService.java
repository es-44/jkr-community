package com.es.community.service;

import com.es.community.event.pub.Publisher;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommunityService {

    private final Publisher publisher;

    public void join() {
        publisher.send();
    }
}
