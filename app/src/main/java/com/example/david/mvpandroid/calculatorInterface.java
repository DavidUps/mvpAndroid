package com.example.david.mvpandroid;

public interface calculatorInterface {

    /**
     * View <-> Presenter <-> Model
     */

    interface View{
        void showResult(String result);
    }

    interface Presenter{
        void showResult(String result);
        void calculator(String data);
    }

    interface Model{
        void calculator(String data);
    }
}
