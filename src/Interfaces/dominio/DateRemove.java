package Interfaces.dominio;

public interface DateRemove {
    void remove();

    default void checkPermission (){
        System.out.println("You are not allowed to access this resource");
    }
}
