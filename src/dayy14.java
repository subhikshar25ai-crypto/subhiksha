public class dayy14 {
    interface Notification{
        void send(String to, String message);
    }
    class CreditNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Credited 200: "+message+", to"+to);
        }

    }
    class DebitNotification implements Notification{
        @Override
        public void send(String to, String message){
            System.out.println("Amount Debited 500: "+message+", to"+to);
        }
    }
    static Notification getNotification(dayy14 factory, String type){
        return switch (type){
            case"Credit"-> factory.new CreditNotification();
            case"Debit"-> factory.new DebitNotification();
            default -> throw new IllegalArgumentException("Invalid account type:"+ type);
        };
    }
    static void main(){
        dayy14 factory = new dayy14();
        String type = "Credit";
        getNotification(factory,type).send(" 123467798","Amount 800 credited");
    }
}



