package com.geekbrains.ru.springlesson2_hw.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Information {

    int roomNumber;
    String nameDoctor;
    String specializationDoctor;
}
