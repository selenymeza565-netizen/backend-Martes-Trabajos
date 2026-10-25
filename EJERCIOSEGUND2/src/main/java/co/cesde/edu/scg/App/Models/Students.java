package co.cesde.edu.scg.App.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long studentsId;

    @Column(nullable = false, length = 100)
    @NotBlank
    @Size(max = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    @NotBlank
    @Size(max = 100)
    private String lastName;

    @Column(nullable = false, length = 100)
    @NotBlank
    @Email
    @Size(max = 100)
    private String email;

    @Column(nullable = false, length = 20)
    @NotBlank
    @Size(max = 20)
    private String phone;

    @Column(nullable = false)
    private boolean active;

    public Students() {
    }

    public Students(
            long studentsId,
            String firstName,
            String lastName,
            String email,
            String phone,
            boolean active
    ) {
        this.studentsId = studentsId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.active = active;
    }

    public Students(
            long studentsId,
            String firstName,
            String lastName,
            String email,
            String phone
    ) {
        this(
                studentsId,
                firstName,
                lastName,
                email,
                phone,
                true
        );
    }

    public long getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(long studentsId) {
        this.studentsId = studentsId;
    }

    // Atajos para el código viejo (DataStore, repositorios, consola)
    @JsonIgnore
    public long getId() {
        return studentsId;
    }

    @JsonIgnore
    public void setId(long id) {
        this.studentsId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentsId=" + studentsId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", active=" + active +
                '}';
    }
}