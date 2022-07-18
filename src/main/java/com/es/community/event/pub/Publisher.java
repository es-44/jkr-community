package com.es.community.event.pub;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Publisher {

    private final StreamBridge streamBridge;

    public void send() {
        streamBridge.send("community-out-0", "커뮤니티 가입 완료");
    }
}
