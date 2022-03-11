package com.example.demo; // demo: Spring Initializr로 생성한 프로젝트 Name

public class Greeting {
    private final long id; // unique identifier
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}