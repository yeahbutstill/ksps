package com.yeahbutstill.ksps.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false, unique = true)
    @NotEmpty
    @NotBlank
    private Long id;

    @Column(name = "member_name", nullable = false, unique = true)
    @NotEmpty
    @NotBlank
    private String memberName;

    @Column(name = "card_number", nullable = false, unique = true)
    @NotEmpty
    @NotBlank
    private Integer cardNumber;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Claim> claims;

}
