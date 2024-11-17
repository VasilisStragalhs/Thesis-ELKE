package documents.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import documents.domainmodel.User;
import documents.mappers.UserMapper;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserMapper userDAO;
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        
		userDAO.save(user);
	}

	@Override
	public boolean isUserPresent(User user) {
		// TODO Auto-generated method stub
		Optional<User> storedUser = userDAO.findByUsername(user.getUsername());
		return storedUser.isPresent();
	}

	@Override
	public User findById(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username)  throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		// orElseThrow method of Optional container that throws an exception if Optional result  is null
			return userDAO.findByUsername(username).orElseThrow(
		                ()-> new UsernameNotFoundException(
		                        String.format("USER_NOT_FOUND %s", username)
		                ));
	}

}
