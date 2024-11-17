package documents.services;

import documents.domainmodel.User;

public interface UserService {
	public void saveUser(User user);
	public boolean isUserPresent(User user);
	public User findById(String username);
}
