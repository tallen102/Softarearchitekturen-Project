package dropboxclone.entities;
import javax.persistence.*;

@Entity
@Table(name = "lots")
public class Lot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lot_id")
    private int lotId;

    @Column(name = "lot_name", unique = true)
    private String lotName;

    
}

