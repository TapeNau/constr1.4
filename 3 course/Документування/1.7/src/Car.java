/*
 *     \file
 *     \version 1.0
 *     \Car.java
 *     \date 06.12.2019
 *     \author envier123@gmail.com
 */

/**
 * \brief Класс автомобиль, который представляет абстракцию реального авто в мире программирования.
 * Класс авто, который представляет абстракцию реального авто в мире программирования. Он содержит такие поля: идентификационный номер автомобиля, марка, модель, год выпуска авто, цвет авто, регистрационный номер, цена авто.
 */

public class Car {
    private String id;// Идентификационный номер автомобиля
    private String brand;   // Марка авто
    private String model;// Модель авто
    private int release_year;// Год выпуска авто
    private String color;// Цвет авто
    private String reg_num;// Регистрационный номер авто
    private String price;// Цена авто
    /**
     *   \brief
     *    Конструктор без параметров
     */
    public Car(){}

    /**
     * Метод,который возвращает ID авто
     *\return ID авто
     */
    public String get_ID()
    { return id;
    }

    /**
     * Метод,который возращает марку авто
     *\return марку авто
     */
    public String get_brand()
    {
        return brand;
    }

    /**
     * Метод, который возвращает модель авто
     *\return модель авто
     */
    public String get_model()
    {
        return model;
    }


    /**
     * Метод, который возвращает год выпуска авто
     *\return год выпуска авто
     */
    public int get_release_year()
    {
        return release_year;
    }
    /**
     * Метод, который возвращает цвет авто
     *\return цвет авто
     */

    public String get_color()
    {
        return color;
    }

    /**
     * Метод, который возвращает регистрационный номер авто
     *\return регистрационный номер авто
     */
    public String get_reg_num()
    {
        return reg_num;
    }

    /**
     * Метод, который возвращает цену авто
     *\return цену авто
     */
    public String get_price()
    {
        return price;
    }
}
