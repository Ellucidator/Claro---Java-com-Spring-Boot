package edu.marcelo.second;

public class Main {

    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
    }
}