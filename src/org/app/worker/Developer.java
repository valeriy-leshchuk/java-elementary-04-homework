package org.app.worker;

public class Developer extends Worker
{
    private static final String DEV_POSITION_NAME = "Developer";

    private String language_;
    private String rate_;

    public Developer(String workerId, String workerName, String language, String rate)
    {
        super(workerId, workerName, DEV_POSITION_NAME);
        language_ = language;
        rate_ = rate;
    }

    @Override
    public String getWorkerPosition()
    {
        return DEV_POSITION_NAME;
    }

    @Override
    public String toString()
    {
        return super.toString() + " lang=" + language_ + ", rate=" + rate_;
    }
}