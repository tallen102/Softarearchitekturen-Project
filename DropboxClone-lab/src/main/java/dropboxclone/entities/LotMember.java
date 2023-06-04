package dropboxclone.entities;

import javax.persistence.*;

@Entity
@Table(name = "lot_members")
@IdClass(LotMemberId.class)
public class LotMember {
    @Id
    @Column(name = "lot_id")
    private int lotId;

    @Id
    @Column(name = "user_id")
    private int userId;

    @ManyToOne
    @JoinColumn(name = "lot_id", referencedColumnName = "lot_id", insertable = false, updatable = false)
    private Lot lot;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;

   
}



