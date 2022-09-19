package com.geekbrains.ru.springlesson2_hw.service.Impl;

import com.geekbrains.ru.springlesson2_hw.service.ArchiveService;
import com.geekbrains.ru.springlesson2_hw.service.RegistryService;
import com.geekbrains.ru.springlesson2_hw.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class RegistryServiceImpl implements RegistryService {

    private ArchiveService archiveService;
    private TimetableService timetableService;

    @Autowired
    public RegistryServiceImpl(ArchiveService archiveService, TimetableService timetableService) {
        this.archiveService = archiveService;
        this.timetableService = timetableService;
    }

    @Override
    public void giveAllInformationForClient(String nameClient, String specialisationDoctor) {
        System.out.println(archiveService.findClientCardByName(nameClient).toString());
        System.out.println(timetableService.giveInfoAboutDoctorBySpecialisation(specialisationDoctor).toString());

    }
}
