public interface Lockable {
    /**
     *
     * @return
     */
    boolean isLocked();

    void lock(User user) throws PermissionException;

    void unlock(User user) throws PermissionException;

}
