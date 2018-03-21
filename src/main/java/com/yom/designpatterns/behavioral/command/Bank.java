package com.yom.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yogendra on 10/3/18.
 */
public class Bank {

    private List<Command> commandList = new ArrayList<>();

    public void takeCommand(Command command){
        commandList.add(command);
    }

    public void executeCommand(){
        commandList.stream().forEach(command -> command.execute());
        commandList.clear();
    }
}
