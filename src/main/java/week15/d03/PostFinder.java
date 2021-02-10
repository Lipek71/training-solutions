package week15.d03;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class PostFinder {
    private List<Post> postList;

    public PostFinder(List<Post> postList) {
        this.postList = postList;
    }

    /*public List<Post> findPostsFor(String user){
        return  postList.stream().filter(pL -> pL.getPublishedAt().isBefore(LocalDate.now())
                || pL.getPublishedAt().isAfter(LocalDate.now())
                && pL.getOwner().equals(user)
                && pL.getContent().length() > 0
                && pL.getTitle().length() > 0
                && (pL.getDeletedAt().equals(null) || pL.getDeletedAt().isAfter(LocalDate.now())))
                .collect(Collectors.toList());
    }*/
    public List<Post> findPostsFor2(String user){
        return  postList.stream().filter(pL -> pL.getPublishedAt().isBefore(LocalDate.now())
                || pL.getOwner().equals(user))
                .filter(pL -> pL.getTitle().length() > 0
                && pL.getContent().length() > 0
                && (pL.getDeletedAt() == null || pL.getDeletedAt().isAfter(LocalDate.now())))
                .collect(Collectors.toList());
    }

}
