package week15.d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    void findPostsForTest() {
        Post postA1 = new Post("My First Post", LocalDate.of(2018, 1, 6), LocalDate.of(2019, 6, 19), "Tartalom", "Pista");
        Post postA2 = new Post("My Article", LocalDate.of(2019, 3, 18), null, "Tartalom", "Pista");
        Post postA3 = new Post("I like Java", LocalDate.of(2020, 2, 20), null, "Tartalom", "Pista");

        Post post1 = new Post("Egy", LocalDate.of(2020,12,12), LocalDate.of(2020,12,12), "Teszt1", "LL");
        Post post2 = new Post("Kettő", LocalDate.of(2021,12,12), LocalDate.of(2021,12,12), "Teszt2", "LL");
        Post post3 = new Post("Egy", LocalDate.of(2021,12,12), null, "Teszt3", "LL");
        List<Post> postList = new ArrayList<>();
        postList.add(post1);
        postList.add(post2);
        postList.add(post3);
        PostFinder postFinder = new PostFinder(postList);
        assertEquals(2, postFinder.findPostsFor2("LL").size());
    }
}