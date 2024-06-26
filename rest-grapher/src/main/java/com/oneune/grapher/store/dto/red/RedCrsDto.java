package com.oneune.grapher.store.dto.red;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RedCrsDto {
    private String type;
    private RedCrsPropertiesDto properties;
}
