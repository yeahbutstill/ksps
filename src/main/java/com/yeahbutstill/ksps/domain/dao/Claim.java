package com.yeahbutstill.ksps.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "claim_id", nullable = false, unique = true)
    @NotEmpty
    @NotBlank
    private Long id;

    @Column(name = "claim_number", nullable = false)
    @NotEmpty
    @NotBlank
    private String claimNumber;

    @Column(name = "admission_date", nullable = false)
    @NotEmpty
    @NotBlank
    private LocalDate admissionDate;

    @Column(name = "hospital_name", nullable = false)
    @NotEmpty
    @NotBlank
    private String hospitalName;

    @Column(name = "created_time", nullable = false)
    @NotEmpty
    @NotBlank
    private LocalDateTime createdTime;

    @OneToMany(mappedBy = "claim", cascade = CascadeType.ALL)
    private List<ClaimItem> claimItems;

    @OneToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member members;

    @OneToOne
    @JoinColumn(name = "status_id", nullable = false)
    private StatusClaim statusClaims;

}
