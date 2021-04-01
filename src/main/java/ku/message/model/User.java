package ku.message.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class User {


    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    private String username;
    private String password;

    private String firstName;
    private String lastName;
    private Instant createdAt;
    private String email;
    private String role;
}
