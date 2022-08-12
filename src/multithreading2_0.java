public class multithreading2_0 {
    public static void main(String[] args) {
        var a1= new hello();
        var a2=new world();
        a1.start();
        a2.start();
    }
    static class hello extends Thread{
        @Override
        public void run() {
            for (int i=0;i<5;i++){
                System.out.println("hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    static class world extends Thread{
        @Override
        public void run() {
            for (int i=0;i<5;i++){
                System.out.println("world");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
