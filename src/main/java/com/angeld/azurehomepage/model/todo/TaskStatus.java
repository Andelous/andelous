package com.angeld.azurehomepage.model.todo;

public enum TaskStatus {
    PENDING("Pending"), IN_PROGRESS("In progress"), COMPLETED("Completed"), DELAYED("Delayed"), DEFERRED("Deferred");

    private String readableName;

    private TaskStatus(String readableName) {
        this.readableName = readableName;
    }

    @Override
    public String toString() {
        return readableName;
    }
}
