package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<Task> tasks) {
        HashSet<String> result = new HashSet<>();
        for (Task element : tasks) {
            result.add(element.getNumber());
        }
        return result;
    }
}
