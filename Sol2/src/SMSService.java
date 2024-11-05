public class SMSService implements NotificationService {


    @Override
    public void notify(Employee emp) {
        System.out.println("Send Sms : " +
                "Bonjour "+emp.getName()+" voici ton status "+emp.getStatus());
    }
}
