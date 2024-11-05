public class EmployeeManager {

    protected EmailService emailService=new EmailService();
    protected SMSService smsService=new SMSService();


    public void changeEmployeeStatus(Employee emp,String newStatus) {
        emp.setStatus(newStatus);
        emailService.sendEmail(emp);
        smsService.sendSMS(emp);
    }

}
