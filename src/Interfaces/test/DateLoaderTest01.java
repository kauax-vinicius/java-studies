package Interfaces.test;

import Interfaces.dominio.DateBaseLoader;
import Interfaces.dominio.FileLoader;

public class DateLoaderTest01 {
    public static void main(String[] args) {
        DateBaseLoader loader = new DateBaseLoader();
        FileLoader fileLoader = new FileLoader();
        loader.load();
        fileLoader.load();
        loader.remove();
        fileLoader.remove();
        fileLoader.checkPermission();
        loader.checkPermission();
    }
}
