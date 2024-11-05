public class SMSService {

    public void sendSMS(Employee emp){
        System.out.println("Send Sms : " +
                "Bonjour "+emp.getName()+" voici ton status "+emp.getStatus());
    }
}
