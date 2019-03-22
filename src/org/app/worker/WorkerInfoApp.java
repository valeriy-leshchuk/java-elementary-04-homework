package org.app.worker;

public class WorkerInfoApp
{
    public static void main(String[] args)
    {
        WorkerInfoStore workerInfoStore = WorkerInfoStore.getInstance();

        //create different workers
        Manager manager1 = new Manager("mngr_1", "Manager1Name", "Project1", 10);
        Manager manager2 = new Manager("mngr_2", "Manager2Name", "Project2", 20);
        Developer developer1 = new Developer("dev_1", "DevName1", "Python", "1.5k");
        Developer developer2 = new Developer("dev_2", "DevName2", "Java", "2k");
        QAEngineer qaEngineer1 = new QAEngineer("qa_1", "QAName1", false);
        QAEngineer qaEngineer2 = new QAEngineer("qa_2", "QAName2", true);

        System.out.println("\nAdding all workers to WorkerInfoStore and printing the result of each adding");
        //add all workers to WorkerInfoStore and see the result of each adding
        System.out.println(workerInfoStore.addWorkerToInfoStore(manager1));
        System.out.println(workerInfoStore.addWorkerToInfoStore(manager2));
        System.out.println(workerInfoStore.addWorkerToInfoStore(developer1));
        System.out.println(workerInfoStore.addWorkerToInfoStore(developer2));
        System.out.println(workerInfoStore.addWorkerToInfoStore(qaEngineer1));
        System.out.println(workerInfoStore.addWorkerToInfoStore(qaEngineer2));

        //Current list of workers
        System.out.println(workerInfoStore.toString());

        System.out.println("\nTrying to add a worker to WorkerInfoStore which is already added:");
        System.out.println(workerInfoStore.addWorkerToInfoStore(manager1));

        Worker worker1 = new Manager("work_mngr_1", "work_mngr_Name1", "Project3", 5);
        System.out.println("\nAdding worker to test casting");
        System.out.println(workerInfoStore.addWorkerToInfoStore(worker1));

        //Current list of workers
        System.out.println(workerInfoStore.toString());
    }
}