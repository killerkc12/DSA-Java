package com.killer.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.deQueue();

        queue.enQueue(30);

        queue.deQueue();

        queue.show();
    }
}
