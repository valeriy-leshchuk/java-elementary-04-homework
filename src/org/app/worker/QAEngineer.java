package org.app.worker;

public class QAEngineer extends Worker
{
    private static final String QAENGINEER_POSITION_NAME = "QAEngineer";

    private boolean automationQA_;

    public QAEngineer(String workerId, String workerName, boolean automationQA)
    {
        super(workerId, workerName, QAENGINEER_POSITION_NAME);
        automationQA_ = automationQA;
    }

    @Override
    public String getWorkerPosition()
    {
        return QAENGINEER_POSITION_NAME;
    }

    @Override
    public String toString()
    {
        return super.toString() + "auto=" + automationQA_;
    }
}