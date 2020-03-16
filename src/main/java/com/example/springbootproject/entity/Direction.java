package com.example.springbootproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
/*方向*/
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String detail;
    private float weight;//方向权重
    @OneToMany(mappedBy = "direction")
    private List<DirectionChioce> directionChioces;
}
