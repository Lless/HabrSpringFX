package com.vk.id26639136.app.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
    @FXML private Button load;

    /**
     * Обработка нажатия кнопки загрузки товаров
     */
    @FXML
    public void onClickLoad() {
        System.out.println("Идёт загрузка");
        // TODO: 18.02.2018 Реализовать получение данных из бд с помощью dao класса и передать данные в таблицу
    }

}
