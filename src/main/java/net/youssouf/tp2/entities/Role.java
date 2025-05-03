package net.youssouf.tp2.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {
    @Id
    private String role;
    private String description;
}
