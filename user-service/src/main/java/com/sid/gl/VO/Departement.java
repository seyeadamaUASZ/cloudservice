package com.sid.gl.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departement {

    private Long departementId;
    private String departementName;
    private String departementAddress;
    private String departementCode;
}
