package java_oracle;

import java_oracle_DAO.ColorDAO;
import java_oracle_DTO.ColorDTO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ColorDAO colorDAO = new ColorDAO();
        ColorDTO colorDTO = new ColorDTO();

        //создадим 5 обьектов класса
        ArrayList<ColorRGB> colorList = new  ArrayList<ColorRGB>();
        colorList.add(new ColorRGB (24, 32, 40, "example1"));
        colorList.add(new ColorRGB (25, 33, 41, "example2"));
        colorList.add(new ColorRGB (26, 34, 42, "example3"));
        colorList.add(new ColorRGB (27, 35, 43, "example4"));
        colorList.add(new ColorRGB (28, 36, 44, "example5"));

        //запишем значения в БД, используя DAO, передав значения через DTO
        for (int i = 0; i < colorList.size(); i++){
            colorDTO.setAll(colorList.get(i));
            colorDAO.addRow(colorDTO);
        }

        //изменим значения обьектов класса
        colorList.get(1).setName("example222");
        colorList.get(3).setName("example444");

        //изменим значения в БД
        colorDTO.setAll(colorList.get(1));
        colorDAO.updateRow(colorDTO, 33);
        colorDTO.setAll(colorList.get(3));
        colorDAO.updateRow(colorDTO, 35);

        //удалим несколько значений из БД
        colorDAO.deleteRow(32);
        colorDAO.deleteRow(36);
    }
}
