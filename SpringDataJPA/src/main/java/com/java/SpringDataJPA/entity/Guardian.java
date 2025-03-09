package com.java.SpringDataJPA.entity;

import jakarta.persistence.*;
import lombok.*;

// This particular guardian class can't be an entity because i don't want to different table for it.
// i want to use this particular property for my Student table only.
// We can do this thing by using embaded




@Embeddable
@Data // for getter,setter,toString and many more things
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "guardian_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")
        ),
        @AttributeOverride(
                name = "mobile",
                column = @Column(name = "guardian_mobile")
        )

})
public class Guardian {

    private String name;
    private String mobile;
    private String email;
}
