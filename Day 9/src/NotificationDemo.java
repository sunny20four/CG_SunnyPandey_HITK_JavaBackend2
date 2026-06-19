interface Notifiable {
    void sendNotification(String recipient,String message);
    boolean isDelivered();
    String getNotificationType();
}

class EmailNotification implements Notifiable {

    boolean delivered=false;

    public void sendNotification(String recipient,String message){
        System.out.println("Sending EMAIL to: "+recipient);
        System.out.println(message);
        delivered=true;
    }

    public boolean isDelivered(){
        return delivered;
    }

    public String getNotificationType(){
        return "EMAIL";
    }
}

class SMSNotification implements Notifiable {

    boolean delivered=false;

    public void sendNotification(String recipient,String message){
        System.out.println("Sending SMS to: "+recipient);
        System.out.println(message);
        delivered=true;
    }

    public boolean isDelivered(){
        return delivered;
    }

    public String getNotificationType(){
        return "SMS";
    }
}

public class NotificationDemo {

    static void notify(Notifiable n,String to,String msg){
        n.sendNotification(to,msg);
        System.out.println(n.getNotificationType()+" "+n.isDelivered());
    }

    public static void main(String[] args){

        notify(new EmailNotification(),"abc@gmail.com","Order Confirmed");
        notify(new SMSNotification(),"9876543210","OTP 1234");
    }
}
