package com.example.springtask2.command;

import com.example.springtask2.logger.DummyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandLineRunnerWithConstructorInjection implements CommandLineRunner {

    private final DummyLogger logger;
    @Override
    public void run(String... args) throws Exception {
        logger.Hello();
    }
}
