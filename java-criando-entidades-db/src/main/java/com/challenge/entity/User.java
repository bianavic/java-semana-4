package com.challenge.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    @Size(max = 100)
    private String fullName;

    @NotNull
    @Email
    @Size(max = 100)
    @Column
    private String email;

    @NotNull
    @Column
    @Size(max = 50)
    private String nickname;

    @Column
    @NotNull
    @Size(max = 225)
    private String password;

    @Column
    @NotNull
    @CreatedDate
    private Date createdAt;

    @OneToMany
    private Set<Candidate> candidates;

    @OneToMany
    private Set<Submission> submission;

}
