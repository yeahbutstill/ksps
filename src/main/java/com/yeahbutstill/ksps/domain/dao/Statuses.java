package com.yeahbutstill.ksps.domain.dao;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@Table(name = "status")
public class Statuses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id", nullable = false, unique = true)
    @NotEmpty
    @NotBlank
    private Long id;

    @NotNull
    @NotEmpty
    @NotBlank
    private String status;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Claim> claims;

}
