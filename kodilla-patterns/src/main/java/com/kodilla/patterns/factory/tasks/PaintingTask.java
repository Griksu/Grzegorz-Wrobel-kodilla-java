package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private final String taskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(final String taskName, final String color,
                        final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        System.out.println("Painting the image of: " + whatToPaint +
                "; colouring: " + color);
        return "Painting is in progress";
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