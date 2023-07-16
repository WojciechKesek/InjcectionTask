package com.example.springtask2.logger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DummyLogger {
    public void Hello(){
        log.info("Hello from DummyLogger");
    }
}
