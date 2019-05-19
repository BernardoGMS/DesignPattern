package psn.design.pattern.designPatterns.ObjectPool;

import java.util.concurrent.BlockingQueue;

public interface Pool<T> {

    T get();

    void release(BlockingQueue object);

    void shutdown();
}
