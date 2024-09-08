package com.atm.system.atmsystem;

import com.atm.system.atmsystem.views.Login;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class AtmApplication extends Application {
    private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
        applicationContext = SpringApplication.run(AtmApplication.class);
    }

    @Override
    public void stop() {
        applicationContext.close();
    }

    @Override
    public void start(Stage stage) {
        Login.loadView(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}