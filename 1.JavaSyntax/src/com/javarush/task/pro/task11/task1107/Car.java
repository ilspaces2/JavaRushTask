package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {

     class Engine {
        private boolean isRunning = false;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }

    }

    Engine engine = new Engine();


}


