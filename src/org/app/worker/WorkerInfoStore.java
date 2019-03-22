package org.app.worker;

import java.util.HashSet;

public class WorkerInfoStore
{
    private static WorkerInfoStore instance_ = null;

    private static final HashSet<Manager> managers_ = new HashSet<>();
    private static final HashSet<Developer> developers_ = new HashSet<>();
    private static final HashSet<QAEngineer> qaEngineers_ = new HashSet<>();

    private WorkerInfoStore()
    {
    }

    public static synchronized WorkerInfoStore getInstance()
    {
        return instance_==null ? new WorkerInfoStore() : instance_;
    }

    public boolean addWorkerToInfoStore (Worker worker)
    {
        if (worker instanceof Manager)
        {
            return addWorkerToInfoStore((Manager) worker);
        }
        else if (worker instanceof Developer)
        {
            return addWorkerToInfoStore((Developer) worker);
        }
        else if (worker instanceof QAEngineer)
        {
            return addWorkerToInfoStore((QAEngineer) worker);
        }
        return false;
    }

    public boolean addWorkerToInfoStore (Manager manager)
    {
        addWorkerToInfoStoreImpl(manager);
        return managers_.add(manager);
    }

    public boolean addWorkerToInfoStore (Developer developer)
    {
        addWorkerToInfoStoreImpl(developer);
        return developers_.add(developer);
    }

    public boolean addWorkerToInfoStore (QAEngineer qaEngineer)
    {
        addWorkerToInfoStoreImpl(qaEngineer);
        return qaEngineers_.add(qaEngineer);
    }

    public void addWorkerToInfoStoreImpl (Worker worker)
    {
        System.out.print("Adding " + worker.getWorkerPosition() + ". ");
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Managers:").append("\n");
        for (Manager manager : managers_)
        {
            sb.append(manager.toString()).append("\n");
        }
        sb.append("Devs:").append("\n");
        for (Developer developer : developers_)
        {
            sb.append(developer.toString()).append("\n");
        }
        sb.append("QA:").append("\n");
        for (QAEngineer qaEngineer : qaEngineers_)
        {
            sb.append(qaEngineer.toString()).append("\n");
        }
        return sb.toString();
    }
}
