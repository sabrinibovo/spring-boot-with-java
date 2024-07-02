package services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.User;
import repositories.UserRepository;
import services.exceptions.ResourceNotFoundException;

@Service
public class UserService{
	@Autowired
	public UserRepository userRepository;
	 
	public List<User> findAll(){
		return userRepository.findAll();
	}
    
	public User findById(Long id) {
	    Optional<User> optionalUser;
	    try {
	    	optionalUser = userRepository.findById(id);
	    }catch (Exception ex) {
	    	throw new ResourceNotFoundException("Could not found this user id: " + id);
	    }
	    if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new ResourceNotFoundException("User not found with id: " + id);
        }
	    
	}

	public User insert(User user) {
	    return userRepository.save(user);
	}

    public void delete(Long id) {
    	try {
            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
            } else {
                throw new ResourceNotFoundException("User not found with id: " + id);
            }
        } catch (Exception ex) {
            throw new ResourceNotFoundException("Could not deleting this user id: " + id);
        }
	}
    
    public User update(Long id, User newUser) {
    	try {
            if (userRepository.existsById(id)) {
              newUser.setName(newUser.getName());
              newUser.setEmail(newUser.getEmail());
              return userRepository.save(newUser);
            } else {
                throw new ResourceNotFoundException("User not found with id: " + id);
            }
        } catch (Exception ex) {
            throw new ResourceNotFoundException("Error occurred while updating user with id: " + id);
        }
  }
}

 