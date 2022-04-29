package io.javadev;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MessageService {
    private final WebClient client;

    public String publishMessage() {
        return client.send("hola");
    }
}
