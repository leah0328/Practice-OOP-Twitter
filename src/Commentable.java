public interface Commentable {

    Comment comment(User user, String content) throws LockedObjectException;


}
