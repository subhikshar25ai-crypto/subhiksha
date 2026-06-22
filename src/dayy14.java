public class dayy14 {
    interface notification {
        void send(String to, String message);
    }

    class emailnotification implements notification {
        @Override
        public void send(String to, String message) {
            System.out.println("sending email" + message + "to");
        }
    }

    class whatsappnotification implements notification {
        @Override
        public void send(String to, String message) {
            System.out.println("sending whatsapp" + message + "to");
        }
    }

    static notification getnotification(dayy14 factory, String type) {
        return switch (type) {
            case "Email" -> factory.new emailnotification();
            case "Whatsapp" -> factory.new whatsappnotification();
            default -> throw new IllegalArgumentException
                    ("Invalid notification type: " + type);
        };
    }

    static void main() {
        dayy14 factory =new dayy14();
        String type = "whatsapp";
        getnotification(factory, type).send("192826413", "hello java");
    }
}
