import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class QueuePractice {
    Queue<Integer> queue =new LinkedList<>();

    public Queue<Integer> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueuePractice that = (QueuePractice) o;
        return Objects.equals(queue, that.queue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queue);
    }
}
