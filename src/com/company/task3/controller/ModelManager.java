package com.company.task3.controller;

import com.company.task3.model.Model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModelManager {

    public Model createModel(Class<?> model) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor constructor = null;
        for (Constructor<?> elem : model.getConstructors()) {
            if(elem.getParameterCount() == 0) {
                constructor = elem;
            }
        }

        return (Model) constructor.newInstance();
    }

    public void changeState(Model model,double value) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method setValue = model.getClass().getDeclaredMethod("setValue", double.class);
        setValue.invoke(model,value);

    }
}
