package com.loja.roupas.infraestructure.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "products")

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "O nome é obrigatorio")
    private String name;
    private String description;
    @NotNull(message = "O preço é obrigatorio")
    @Positive(message = "O preço deve ser maior que zero")
    @DecimalMin("0.01")
    private BigDecimal price;
    private Integer stockQuantity;
    private String brand;
    private Boolean active;

}
