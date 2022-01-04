package com.javarush.task.task17.task1712;

public class Cook implements Runnable {
    public boolean continueWorking = true;          //продолжает работать

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("Повар отдыхает");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // повар берет заказ из очереди
        System.out.println(String.format("Заказ будет готовиться %d мс для стола №%d", order.getTime(), order.getTableNumber()));  //берет из заказа время и номер стола
        Thread.sleep(order.getTime());     // готовим блюдо со временем равном времени в заказе
        Dishes dishes = new Dishes(order.getTableNumber());   //  это готовое блюдо с номером стола из заказа
        manager.getDishesQueue().add(dishes);// кладем это блюдо в очередь готовыхз заказов
        System.out.println(String.format("Заказ для стола №%d готов", dishes.getTableNumber()));
    }
}
