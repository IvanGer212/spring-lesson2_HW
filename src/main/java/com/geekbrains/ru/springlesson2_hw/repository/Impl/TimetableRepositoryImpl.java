package com.geekbrains.ru.springlesson2_hw.repository.Impl;

import com.geekbrains.ru.springlesson2_hw.domain.Information;
import com.geekbrains.ru.springlesson2_hw.repository.TimetableRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Optional;

//@Component
@Repository
public class TimetableRepositoryImpl implements TimetableRepository {

    private ArrayList<Information> info;

    @PostConstruct
    void init(){
        info = new ArrayList<>();

        info.add(new Information(123,"Belova","therapist"));
        info.add(new Information(156,"Chernov","surgeon"));
        info.add(new Information(214,"Krasnova", "optometrist"));

    }

    @Override
    public Optional<Information> giveInfoAboutDoctorBySpecialisation(String specialisation) {
        for (Information information: info) {
            if (information.getSpecializationDoctor()==specialisation){
                return Optional.of(information);
            }
        }
        return Optional.empty();
    }
}
