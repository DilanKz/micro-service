package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Dilan
 * @created 25/11/2023 - 07:46 pm
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrderDTO {
    private String id;
    private String date;
}
