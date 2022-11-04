package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.store.FlowerBucket;

import java.util.List;

public interface Delivery {
    void deliver(List<FlowerBucket>items);
}
