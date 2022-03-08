package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(final String taskName, final String where,
                       final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        System.out.println("Driving to: " + where + "; using: " + using);
        return "Driving is finished";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (executeTask().contains("finished")) {
            return true;
        } else {
            return false;
        }
    }
}
