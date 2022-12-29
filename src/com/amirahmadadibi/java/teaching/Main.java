package com.amirahmadadibi.java.teaching;

import com.amirahmadadibi.java.teaching.DIP.bad.LEDMonitor;
import com.amirahmadadibi.java.teaching.DIP.bad.StandardKeyboard;
import com.amirahmadadibi.java.teaching.DIP.bad.WindowsMachine;
import com.amirahmadadibi.java.teaching.DIP.good.LazerKeyboard;

public class Main {
    public static void main(String[] args) {
        LazerKeyboard lazerKeyboard = new LazerKeyboard();
        StandardKeyboard standardKeyboard = new StandardKeyboard();
        LEDMonitor ledMonitor =new LEDMonitor();

        WindowsMachine windowsMachine = new  WindowsMachine(ledMonitor,standardKeyboard);
    }
}
