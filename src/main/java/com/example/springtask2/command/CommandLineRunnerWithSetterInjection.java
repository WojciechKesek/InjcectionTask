package com.example.springtask2.command;

import com.example.springtask2.logger.DummyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithSetterInjection implements CommandLineRunner {
    private DummyLogger logger;
    @Autowired
    public void setLogger(DummyLogger logger) {
        this.logger = logger;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.Hello();
    }
}
