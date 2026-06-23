/*
public class day15 {
    static void main()throws InterruptedException{
        Runnable chefTask = ()-> {
            String[] items = {"chicken", "mutton", "noodles"};
            for (int i = 0; i < items.length; i++) {
                System.out.println("Cooking Item: "+items[i]);
                try{
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        };
        Thread chefThread = new Thread(chefTask);
        chefThread.start();
        chefThread.join();
    }

}

 */
