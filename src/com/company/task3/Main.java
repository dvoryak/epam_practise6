package com.company.task3;

import com.company.task3.controller.Controller;
import com.company.task3.view.View;
import com.company.task3.view.ViewImpl;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        View view = new ViewImpl();
        Controller controller = new Controller(view);
        controller.run();
    }

}
