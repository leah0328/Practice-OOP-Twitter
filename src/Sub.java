import java.util.*;

public class Sub {
    private final UUID id;
    private final String name;
    private final List<Post> posts;

    private final List<User> admins;
    private final Set<User> followers;

    public Sub(String name, User founder){
        this.id = UUID.randomUUID();
        this.name = "r/" + name;
        this.posts = new LinkedList<>();
        this.followers = new HashSet<>();
        this.admins = new ArrayList<>();
        this.admins.add(founder);
        this.followBy(founder);
    }

    public void followBy(User user) {
        followers.add(user);
        user.followSub(this);
    }

    public Post post(User user, String content){
        Post post = new Post(user, content);
        posts.add(post);
        user.addPostHistory(post);
        return post;
    }

    public String getName() {
        return name;
    }

    public Set<User> getFollowers() {
        return followers;
    }
}
