package org.app.worker;

public class Worker
{
    protected String workerId_;
    protected String workerName_;
    protected String workerPosition_;

    protected Worker(String workerId, String workerName, String workerPosition)
    {
        workerId_ = workerId;
        workerName_ = workerName;
        workerPosition_ = workerPosition;
    }

    public String getWorkerId()
    {
        return workerId_;
    }

    public void setWorkerId(String workerId)
    {
        workerId_ = workerId;
    }

    public String getWorkerName()
    {
        return workerName_;
    }

    public void setWorkerName(String workerName)
    {
        workerName_ = workerName;
    }

    public String getWorkerPosition()
    {
        return workerPosition_;
    }

    public void setWorkerPosition(String workerPosition)
    {
        //TODO: changing worker's position should also move him to another group in WorkerInfoStore
        workerPosition_ = workerPosition;
    }

    @Override
    public String toString()
    {
        return "id=" + workerId_ + ", name=" + workerName_ + ", position=" + workerPosition_;
    }
}
