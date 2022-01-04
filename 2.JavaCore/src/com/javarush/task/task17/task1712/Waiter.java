package com.javarush.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishesQueue().isEmpty()) {
            if (!manager.getDishesQueue().isEmpty()) {
                Dishes dishes = manager.getDishesQueue().poll();  // забираем готовый заказ
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber());
            } else {                                         //берем новый заказ
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("Получен заказ от стола №" + order.getTableNumber());
                manager.getOrderQueue().add(order);//добавляем заказ с номером стола и временем к менеджеру в очередь
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}
