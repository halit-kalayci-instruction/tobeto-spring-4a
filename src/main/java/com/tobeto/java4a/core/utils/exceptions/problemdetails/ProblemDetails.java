package com.tobeto.java4a.core.utils.exceptions.problemdetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProblemDetails {
    private String title;
    private String detail;
    private String type;
}
