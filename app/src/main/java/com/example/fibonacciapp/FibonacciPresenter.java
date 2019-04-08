package com.example.fibonacciapp;

public class FibonacciPresenter {


    private FibView view;

    public void generateFibonacciSequence() {

        String sequence;

        int resultPrevious = 0;
        int resultFibNumber = 1;
        int resultNextFib;
        int count = 10;


        sequence = resultPrevious + "," + resultFibNumber + ",";

        for (int i = 2; i < count; ++i) {

            resultNextFib = resultPrevious + resultFibNumber;

            resultPrevious = resultFibNumber;
            resultFibNumber = resultNextFib;

            sequence = sequence + resultFibNumber + ",";
        }

        view.setFibText(cleanUpSequence(sequence));

    }

    private String cleanUpSequence(String text){

        int lastNumber = text.length() - 1;

        if(text.substring(lastNumber).equals(",")){
            return text.substring(0, lastNumber);
        }

        return text;

    }


    public void setView(FibView view) {
        this.view = view;
    }


    public interface FibView {

        void setFibText(String text);
    }


}
