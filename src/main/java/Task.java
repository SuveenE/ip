public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription(){
        return this.description;
    }

    public boolean getIsDone(){
        return this.isDone;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); 
    }

    public void mark(){
        this.isDone = true;
    }

    public void unMark(){
        this.isDone = false;
    }

}
