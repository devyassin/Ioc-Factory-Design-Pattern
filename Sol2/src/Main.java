
public class Main {
    public static void main(String[] args) {
    Employee employee=new Employee("yassine","Full stack Dev");

    IoCContainer ioCContainer=new IoCContainer();
    NotificationService emailService=new EmailService();
    NotificationService smsServie=new SMSService();

    ioCContainer.registerService(EmailService.class,emailService);
    ioCContainer.registerService(SMSService.class,smsServie);

    EmployeeManager employeeManager=new EmployeeManager(ioCContainer);

    employeeManager.changeEmployeeStatus(employee,"Consultant","email");

    employeeManager.changeEmployeeStatus(employee,"Manager","sms");

    }
}