package annotations.coachapp;

import annotations.coachapp.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BaseballCoach extends Coach {
    @PostConstruct
    public void doInit(){
        System.out.println("init");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("destroy");
    }

    @Override
    public String getDailyWorkout() {
        return "spend 30 minutes on batting field";
    }
}
