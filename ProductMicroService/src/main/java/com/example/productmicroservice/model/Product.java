package com.example.productmicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
@Entity
@Table(name="tbl_products")
@AllArgsConstructor @NoArgsConstructor @Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "El nombre del campo no debe estar vacio")
    private String name;
    private String description;
    @Positive(message = "El stock debe ser mayor que cero")
    private Double stock;
    private Double price;
    private String status;
    @Column(name="created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @NotNull(message = "La categoria no puede estar vacia")
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
