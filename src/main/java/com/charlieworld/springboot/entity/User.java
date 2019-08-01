package com.charlieworld.springboot.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Setter
@Getter
@TableGenerator(name = "SEQ_TABLE_GEN", table = "SEQ_TABLE", pkColumnValue = "SEQ", allocationSize = 1, initialValue = 1)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SEQ_TABLE_GEN")
    private Long userId;

    private String name;
}
