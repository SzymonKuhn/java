package pl.sda.interfacesTasks;

public interface Being {
    int getAge();
    int MAX_AGE = 100;
    default boolean isAlive(){
        return (getAge()<MAX_AGE);
    }
}
