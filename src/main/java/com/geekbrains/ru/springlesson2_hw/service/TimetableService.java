package com.geekbrains.ru.springlesson2_hw.service;

import com.geekbrains.ru.springlesson2_hw.domain.Information;

import java.util.Optional;

public interface TimetableService {

    Optional<Information> giveInfoAboutDoctorBySpecialisation (String specialisation);
}
