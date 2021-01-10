package collectionsqueue.collectionspriorityqueue;

import collectionsqueue.NoJobException;

import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {

    public Queue<Job> addJob(Job... jobs){
        PriorityQueue<Job> jobList = new PriorityQueue<>();
        for (Job job: jobs){
            jobList.offer(job);
        }
       return jobList;
       //return new PriorityQueue<Job>(Arrays.asList(jobs));
    }

    public Job dispatchNextJob(Queue<Job> jobs) throws NoJobException {
        if (jobs == null || jobs.isEmpty()){
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.poll();
    }
}
