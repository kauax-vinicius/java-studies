package Interfaces.dominio;

public class FileLoader implements DateLoader, DateRemove {

    @Override
    public void load() {
        System.out.println("Loading File");
    }

    @Override
    public void remove() {
       System.out.println("Removing File");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking Permission");
    }
}
