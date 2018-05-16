package com.example.david.mvpandroid;

public class calculatorPresenter implements calculatorInterface.Presenter {

    calculatorInterface.View view;
    calculatorInterface.Model model;

    public calculatorPresenter(calculatorInterface.View view){
        this.view = view;
        model = new calculatorModel(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null){
            view.showResult(result);
        }
    }

    @Override
    public void calculator(String data) {
        //Calculo
    }
}
