package de.consol.devday.workshop.service;

import de.consol.devday.service.EventService;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class WorkshopService implements EventService {

    public List<String> getEvents() {
        return Stream.of(
                "Kubernetes",
                "Gamification"
            )
            .map(WorkshopService::prefix)
            .collect(toList());
    }

    static String prefix(String input) {
        return String.format("Workshop: %s", input);
    }
}
