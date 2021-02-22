package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private final String name;
    private final LocalDateTime time;
    private final Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(Issue issue, CopyMode copyMode){
        name = issue.getName();
        time = issue.getTime();
        status = issue.getStatus();
        if(copyMode.equals(CopyMode.WITH_COMMENTS)){
            List<Comment> tmp = new ArrayList<>();
            for (Comment comment: issue.comments){
                tmp.add(new Comment(comment.getText(), comment.getTime()));
            }
            comments=tmp;
        }
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
