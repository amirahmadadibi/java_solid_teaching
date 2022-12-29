package com.amirahmadadibi.java.teaching.DIP.bad;

import com.amirahmadadibi.java.teaching.DIP.good.Keyboard;
import com.amirahmadadibi.java.teaching.DIP.good.Monitor;


public class WindowsMachine {
    Monitor monitor;
    Keyboard keyboard;

    public WindowsMachine(Monitor monitor,Keyboard keyboard){
            monitor = this.monitor;
            keyboard = this.keyboard;
    }
}
