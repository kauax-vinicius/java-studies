package Interfaces.dominio;

public class DateBaseLoader implements DateLoader, DateRemove {

    @Override
    public void load() {
        System.out.println("Loading DateBase");
    }

    @Override
    public void remove() {
        System.out.println("Removing DateBase");
    }

    @Override
    public void checkPermission() {
      System.out.println("Checking Permission");
    }
}
