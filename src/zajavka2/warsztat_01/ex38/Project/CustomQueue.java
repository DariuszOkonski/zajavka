package zajavka2.warsztat_01.ex38.Project;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class CustomQueue<T> {
    private final Deque<T> queue;
    private final Map<String, Integer> counterMap = new HashMap<>();

    public CustomQueue(Deque<T> queue) {
        this.queue = queue;
    }

    public void welcome(T item) {
        queue.offer(item);
        System.out.println(queue);
    }

    public Integer getAndIncrementCounter(String key) {
        Integer tempCounter = counterMap.getOrDefault(key, 0);
        counterMap.put(key, ++tempCounter);
        return tempCounter;
    }
}

