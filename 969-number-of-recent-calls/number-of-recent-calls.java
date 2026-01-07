import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // add current request time
        queue.add(t);

        // remove old requests
        while (queue.peek() < t - 3000) {
            queue.remove();
        }

        // number of recent requests
        return queue.size();
    }
}
