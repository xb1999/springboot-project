package com.example.springbootproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
/*方向选择*/
public class DirectionChioce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Direction direction;
}
