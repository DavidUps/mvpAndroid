package com.example.david.mvpandroid;

public class calculatorModel implements  calculatorInterface.Model{

    calculatorInterface.Presenter presenter;
    int result;

    public calculatorModel(calculatorInterface.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void calculator(String data) {
    }
}
