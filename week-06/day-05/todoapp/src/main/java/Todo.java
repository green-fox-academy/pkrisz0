public class Todo {
    String description;
    Boolean complete;

    public Todo() {
    }

    public Todo(String descritpion){
        this.description = descritpion;
        complete = false;
    }

    public Todo(String description, boolean complete) {
        this.description = description;
        this.complete = complete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "[" + (complete ? "x" : " ") + "] " + description;
    }
}
