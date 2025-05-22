package com.Ecomarket.EcoMarket.Spa.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="producto")
@Data
@NoArgsConstructor
@AllArgsConstructor



public class Producto {



  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  

  @Column(nullable = false)
  private Integer precio;


  @Column(nullable = false)
  private String nombre;


  @Column(nullable = false)
  private String marca;


  @Column(nullable = false)
  private Integer cantidad;


}
    
