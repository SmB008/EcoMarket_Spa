package com.Ecomarket.EcoMarket.Spa.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="gerente")
@Data
@NoArgsConstructor
@AllArgsConstructor



public class Gerente {



  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(nullable = false)
  private String rol;

  @Column(unique = true, length = 13, nullable = false)
  private String rut;


  @Column(nullable = false)
  private String nombre;


  @Column(nullable = false)
  private String apellido;


  @Column(nullable = false)
  private Integer telefono;


  @Column(nullable = false)
  private String correo;


  @Column(nullable = false)
  private String direccion;


}
    

    

