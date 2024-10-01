package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Entity
@Table (name = "persona")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
public class Persona extends Base{
    private Long id;
    private String nombre;
    private String apellido;
    private int dni;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
}
