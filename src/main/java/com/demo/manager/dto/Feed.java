package com.demo.manager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feed {
    int id;
    int catid;
    Timestamp time;
    int locationid;
    int foodid;
}
