package intromethods;

public class Todo {
    private String caption;
    private boolean finished = false;

    public Todo(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public boolean isFinished() {
        return finished;
    }

    public void finish(){
        finished = true;
    }

    @Override
    public String toString() {
        return "A következő feladat: " + caption + " (" + finished + ")";
    }
}
