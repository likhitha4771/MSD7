package model;

public class Task {
    private String title;
    private String description;
    private int priority;
    private boolean isCompleted;

    public Task(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getPriority() { return priority; }
    public boolean isCompleted() { return isCompleted; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setPriority(int priority) { this.priority = priority; }
    public void markAsComplete() { this.isCompleted = true; }

    @Override
    public String toString() {
        return "\nTitle: " + title +
               "\nDescription: " + description +
               "\nPriority: " + priority +
               "\nStatus: " + (isCompleted ? "✅ Completed" : "❌ Pending") + "\n";
    }
}
