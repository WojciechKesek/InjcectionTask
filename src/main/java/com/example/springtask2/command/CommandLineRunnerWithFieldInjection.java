package com.example.springtask2.command;

import com.example.springtask2.logger.DummyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerWithFieldInjection implements CommandLineRunner {
    @Autowired
    DummyLogger logger;
    @Override
    public void run(String... args) throws Exception {
        logger.Hello();
    }
}
