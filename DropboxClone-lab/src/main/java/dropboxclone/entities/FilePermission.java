package dropboxclone.entities;

import javax.persistence.*;

@Entity
@Table(name = "file_permissions")
public class FilePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permission_id")
    private int permissionId;

    @ManyToOne
    @JoinColumn(name = "file_id", referencedColumnName = "file_id")
    private File file;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "permission_type", nullable = false)
    private PermissionType permissionType;

    // Constructors, getters, and setters

    public enum PermissionType {
        READ,
        READ_WRITE
    }
}





    

