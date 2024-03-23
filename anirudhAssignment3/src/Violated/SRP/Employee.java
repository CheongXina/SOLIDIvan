package Violated.SRP;

public class Employee {

    protected void ManageEmployees(){}
    protected void WatchTrainingVideos(){}
    protected double calcIncomeManager(){return 50.0;}
    protected double calcIncomeCashier(){return 20.0;}
    //Violated because this is a monolithic class that could be split into subclasses to avoid over coupling

}
