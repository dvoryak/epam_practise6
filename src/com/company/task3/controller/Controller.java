package com.company.task3.controller;

import com.company.task3.model.Model;
import com.company.task3.view.Constant;
import com.company.task3.view.View;
import com.sun.corba.se.impl.io.TypeMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    View view;
    ModelManager manager = new ModelManager();


    public Controller(View view) {
        this.view = view;
    }

    public void run() {
        Model model = null;
        while (true) {
            showMenu();
            try {
                switch (new Scanner(System.in).nextInt()) {
                    case 1:
                        model = manager.createModel(Model.class);
                        view.showMessage(Constant.NEW_INSTANCE_CREATED);
                        break;
                    case 2:
                        view.showMessage(Constant.ENTER_VALUE);
                        double d = new Scanner(System.in).nextDouble();
                        if(model != null) {
                            manager.changeState(model, d);
                        } else view.showMessage(Constant.OBJECT_WAS_NOT_CREATED);
                        break;
                    case 3:
                        if(model != null) {
                            view.showMessage(model.toString());
                        } else view.showMessage(Constant.OBJECT_WAS_NOT_CREATED);
                        break;
                    case 4: System.exit(0);

                    default: view.showMessage(Constant.WRONG_INPUT);
                }
            }
            catch (InputMismatchException e) {
                view.showMessage(Constant.WRONG_INPUT);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void showMenu() {
        System.out.println("1. Создать новый обьект");
        System.out.println("2. Изменить состояние");
        System.out.println("3. Отобразить состояние");
        System.out.println("4. Выйти");
    }



}
