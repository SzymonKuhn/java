package pl.sda.interfacesTasks;

public interface Plant extends Being {
    int MAX_AGE = 1000;
    @Override
    default boolean isAlive() {
        return getAge()<MAX_AGE;
    }
}
