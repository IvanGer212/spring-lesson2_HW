package com.geekbrains.ru.springlesson2_hw.service.Impl;

import com.geekbrains.ru.springlesson2_hw.domain.Information;
import com.geekbrains.ru.springlesson2_hw.repository.TimetableRepository;
import com.geekbrains.ru.springlesson2_hw.service.TimetableService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Component
@Service
public class TimetableServiceImpl implements TimetableService {

    private TimetableRepository timetableRepository;

    public TimetableServiceImpl(TimetableRepository timetableRepository) {
        this.timetableRepository = timetableRepository;
    }

    @Override
    public Optional<Information> giveInfoAboutDoctorBySpecialisation(String specialisation) {
        return timetableRepository.giveInfoAboutDoctorBySpecialisation(specialisation);
    }
}
