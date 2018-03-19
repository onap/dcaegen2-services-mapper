package org.onap.universalvesadapter.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * Utility class to execute parallel tasks
 * 
 * @author kmalbari
 *
 */
public class ParallelTasks
{
    private final Collection<Runnable> tasks = new ArrayList<Runnable>();

    public ParallelTasks()
    {
    }

    /**
     * 
     * Add task to be executed in parallel
     * 
     * @param task
     */
    public void add(final Runnable task)
    {
        tasks.add(task);
    }

    /**
     * starts all the added tasks in parallel
     * 
     * @throws InterruptedException
     */
    public void startParallelTasks() throws InterruptedException
    {
        final ExecutorService threads = Executors.newFixedThreadPool(Runtime.getRuntime()
                .availableProcessors());
        try
        {
            final CountDownLatch latch = new CountDownLatch(tasks.size());
            for (final Runnable task : tasks)
                threads.execute(new Runnable() {
                    public void run()
                    {
                        try
                        {
                            task.run();
                        }
                        finally
                        {
                            latch.countDown();
                        }
                    }
                });
            latch.await();
        }
        finally
        {
            threads.shutdown();
        }
    }
}