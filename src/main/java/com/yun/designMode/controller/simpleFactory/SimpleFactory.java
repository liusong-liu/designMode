package com.yun.designMode.controller.simpleFactory;

public class SimpleFactory {
    public static void main(String[] args) {
        Client client = new Client();
        AbstractFactory make = client.make(0);
        make.show();
    }

    interface AbstractFactory {
        public void show();
    }

    static class FactoryA implements AbstractFactory {

        @Override
        public void show() {
            System.out.println("FactoryA");
        }
    }

    static class FactoryB implements AbstractFactory {

        @Override
        public void show() {
            System.out.println("FactoryB");
        }
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
    }

    static class Client{
        public static AbstractFactory make(int kind){
            switch (kind) {
                case Const.PRODUCT_A:
                    return new FactoryA();
                case Const.PRODUCT_B:
                    return new FactoryB();
            }
            return null;
        }
    }


}
