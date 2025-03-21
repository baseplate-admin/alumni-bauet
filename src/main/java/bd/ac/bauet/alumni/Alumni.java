package bd.ac.bauet.alumni;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table
public class Alumni {
    @Id
    @SequenceGenerator(name = "alumni_sequence", sequenceName = "alumni_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumni_sequence")
    private Long id;

    private String name;

    private String password; // This should store a BCrypt-hashed password
    private String profilePicture; // URL of the uploaded profile picture

    private LocalDate birthday;
    private LocalDate graduationDate;

    private String gender;
    private String bloodGroup;
    private String email;
    private String phone;

    private String jobTitle;
    private String jobDescription;
}
