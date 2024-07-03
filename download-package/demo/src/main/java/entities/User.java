package entities;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name = "tb_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
        private static int id;
    	private static String name;
    	private static String email;
    	private static String password;
    	
    	public User() {
    	}
        
    	public User(int id,String name, String email, String password){
    		User.id = id;
    		User.name = name;
    		User.email = email;
    		User.password = password;
    	}

		public User(Object object, String string, String string2, String string3, String string4) {
			 //TODO Auto-generated constructor stub
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			User.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			User.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			User.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			User.password = password;
		}

		@Override
		public int hashCode() {
			return Objects.hash(email, id, name, password);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			return Objects.equals(email, User.email) && Objects.equals(id, User.id) && Objects.equals(name, User.name)
					&& Objects.equals(password, User.password);
		}
		
}
