package net.youssouf.tp2.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private String username;
    private String password;
    private boolean active;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
}
