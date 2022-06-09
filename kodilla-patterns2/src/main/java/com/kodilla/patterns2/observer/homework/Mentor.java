package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int taskCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        String taskNo = (tasksQueue.getTasks().size() < 2) ? " task)" : " tasks)";
        System.out.println("Mentor " + mentorName + " received new task from " + tasksQueue.getName() + "\n" +
                " (total: " + tasksQueue.getTasks().size() + taskNo);
        taskCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getTaskCount() {
        return taskCount;
    }
}
