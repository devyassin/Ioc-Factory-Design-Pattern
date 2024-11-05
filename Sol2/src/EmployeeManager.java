public class EmployeeManager {

    protected IoCContainer ioCContainer;


    public EmployeeManager(IoCContainer ioCContainer){
        this.ioCContainer = ioCContainer;
    }
    public void changeEmployeeStatus(Employee emp,String newStatus, String notificationType) {
        emp.setStatus(newStatus);
        NotificationService notificationService=ioCContainer.createService(notificationType);
        notificationService.notify(emp);
    }

}
