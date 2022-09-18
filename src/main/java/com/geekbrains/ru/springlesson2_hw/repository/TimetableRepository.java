package com.geekbrains.ru.springlesson2_hw.repository;

import com.geekbrains.ru.springlesson2_hw.domain.Information;

import java.util.Optional;

public interface TimetableRepository {

    Optional<Information> giveInfoAboutDoctor();

}
