package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 문제와 풀이2 : Queue
 */
public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public void processNextTask() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute();
        }
    }

    public int getRemainingTasks() {
        return tasks.size();
    }
}
