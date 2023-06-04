package dropboxclone.entities;
import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private int fileId;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "file_path", nullable = false)
    private String filePath;

    @Column(name = "file_parent")
    private String fileParent;

    @Column(name = "is_file", nullable = false)
    private boolean isFile;

    @Column(name = "starred", nullable = false)
    private boolean starred;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "user_id")
    private User owner;

    @ManyToOne
    @JoinColumn(name = "shared_group_id", referencedColumnName = "lot_id")
    private Lot sharedGroup;

    @Column(name = "quota_used", nullable = false)
    private long quotaUsed;

   
}

