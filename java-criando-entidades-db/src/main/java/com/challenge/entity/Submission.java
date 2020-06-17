package com.challenge.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;
import java.util.Date;

@ToString
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Submission {

    @EmbeddedId
    private SubmissionId id;

    @Column
    @NotNull
    private Float score;

    @Column
    @NotNull
    @CreatedDate
    private Date createdAt;

}
