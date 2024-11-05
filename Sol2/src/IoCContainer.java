import java.util.HashMap;

public class IoCContainer {

    private HashMap<Class<?>,Object> services=new HashMap<>();

    public void registerService(Class<?> serviceType, Object serviceInstance) {
        services.put(serviceType, serviceInstance);
    }

    public <T> T getService(Class<?> serviceType){
        return (T)services.get(serviceType);
    }

    public NotificationService createService(String serviceType) {
        switch (serviceType.toLowerCase()) {
            case "email":
                return getService(EmailService.class);
            case "sms":
                return getService(SMSService.class);
            default:
                throw new IllegalArgumentException("Unknown service type: " + serviceType);
        }
    }

}
