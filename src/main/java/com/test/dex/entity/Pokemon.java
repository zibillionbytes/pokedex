package com.test.dex.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pokédex")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;

    @Column(name = "Type 1")
    private String type1;
    @Column(name = "Type 2")
    private String type2;
    @Column(name = "Total")
    private int total;
    @Column(name = "Attack")
    private int attack;
    @Column(name = "Defense")
    private int defense;
    @Column(name = "Sp. Atk")
    private int SpAtk;
    @Column(name = "Sp. Def")
    private int SpDef;
    @Column(name = "Speed")
    private int speed;
    @Column(name = "Generation")
    private int generation;
    @Column(name = "Legendary")
    private boolean legendary;
}