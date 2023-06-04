package dropboxclone.entities;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password_", nullable = false)
    private String password;

    @Column(name = "quota", nullable = false)
    private long quota;

    @Column(name = "root_directory", nullable = false)
    private String rootDirectory;

    @Column(name = "admin_access", nullable = false)
    private boolean adminAccess;

	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

    
}

