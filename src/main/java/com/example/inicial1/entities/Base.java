package com.example.persona.entities;





@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Base implements Serializable {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
}