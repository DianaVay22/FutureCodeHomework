package org.future.code.homework;

public class HomeWork5 {
    /*
        Домашнее задание:
        Создайте класс "Персонаж", придумайте 3 характеристики (3 поля класса) и 3 свойства (3 метода).
        Конструктор класса не должен создавать персонажа без имени.
        Реализация конструктора на ваше усмотрение.
        Не забудьте защитить поля класса, а так же о Геттерах и сеттерах, если они нужны в вашей реализации.

        Придумайте и создайте 2 новых класса, Волшебник и Лучник, которые будут наследоваться от "Персонажа".
        -В каждом из новых классов переопределите конструктор родителя таким образом,
            чтобы добавить Волшебнику новую характеристику "мана".
	    а лучнику навык стрельбы.
        -Необходимо в каждом из новых классов переопределить по одному базовому мтоду класса родителя.
	    Это метод приветственной реплики. Придумайте базовому персонажу, а так же Волшебнику и Лучнику
	    по приветрсвенной фразе, которая будет выводиться на экран.
        -Перегрузить по одному базовому методу. это метод нанесения урона. Например в базовом классе Персонажа
	    этот метод наносит урон в зависимости от силы. У волшебника в зависимости от маны,
	    а у лучника в зависимости от стрельбы.

        Создайте класс персонажа тестировщика, который будет наследоваться от класса "Персонаж".
        Запретите создавать объекты этого класса всем кроме тестировщика.
        Для этого:
        -Содайте класс ошибки создания персонажа.
        -Выкините это ошибку, когда происходит создание любого персонажа класса тестировщика,
            кроме персонажа с именем "Test".
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
