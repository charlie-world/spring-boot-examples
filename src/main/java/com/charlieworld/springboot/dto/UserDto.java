package com.charlieworld.springboot.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Setter
@Getter
public class UserDto implements Serializable {
    private Long userId;
    private String name;

    public UserDto(Long userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}
