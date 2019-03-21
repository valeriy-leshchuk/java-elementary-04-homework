# Домашнее задание № 4

  1. Сделать FORK с текущего репозитория в свой аккаунт
  2. Сделать классы-наследники класса org.app.woker.Worker и добавить в них свойства:
        * класс Manager
        ** свойство String project
        ** свойство int expirience;
        * класс Programmer
        ** свойство String language
        ** свойство String rate;
        * класс QAEngeneer
        ** свойство boolean automationQA;

* В каждом из классов-наследников переопределить метод getWorkerPosition

3. В класс WorkerInfoStore добавить 3 **private** свойства:
        * Manager [] managers;
        * Programmer [] programmers;
        * QAEngeneer[] qaEngeneers;

4. В класс WorkerInfoStore добавить и реализовать следущие методы:
```
    //добавить в массив managers
    public void add(Manager worker);

    //добавить в массив programmers
    public void add(Programmer worker);

    //добавить в массив qaEngeneers
    public void add(QAEngeneer worker);

    /**
    * В этом методе проанализировать тип worker - с помощью instanceof.
    * Если тип - Manager - добавить в массив managers
    * Если тип - Programmer - добавить в массив managers
    * Если тип - QAEngeneer - добавить в массив qaEngeneers
    **/
    public void add(Worker worker);
```
5. Сделать чтобы класс WorkerInfoStore реализовывал паттерн Singleton.