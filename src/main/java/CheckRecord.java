package main.java;

@FunctionalInterface
public interface CheckRecord {
    public abstract boolean checkIfRecordExist(String username);
}

