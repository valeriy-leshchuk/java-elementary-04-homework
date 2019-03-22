package org.app.worker;

public class Manager extends Worker
{
    private static final String MNGR_POSITION_NAME = "Manager";

    private String project_;
    private int experience_;

    public Manager(String workerId, String workerName, String project, int experience)
    {
        super(workerId, workerName, MNGR_POSITION_NAME);
        project_ = project;
        experience_ = experience;
    }

    @Override
    public String getWorkerPosition()
    {
        return MNGR_POSITION_NAME;
    }

    @Override
    public String toString()
    {
        return super.toString() + " project=" + project_ + ", experience=" + experience_;
    }
}