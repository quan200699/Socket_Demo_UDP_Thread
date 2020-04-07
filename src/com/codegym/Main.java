package com.codegym;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        EchoServer echoServer = new EchoServer();
        EchoClient echoClient = new EchoClient();
        Thread thread = new Thread(echoServer);
        thread.start();
        System.out.println(echoClient.sendEcho("Hello server"));
    }
}
