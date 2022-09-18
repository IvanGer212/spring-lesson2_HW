package com.geekbrains.ru.springlesson2_hw.service.Impl;

import com.geekbrains.ru.springlesson2_hw.domain.ClientCard;
import com.geekbrains.ru.springlesson2_hw.repository.ArchiveRepository;
import com.geekbrains.ru.springlesson2_hw.service.ArchiveService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ArchiveServiceImpl implements ArchiveService {

    private ArchiveRepository archiveRepository;

    public ArchiveServiceImpl(ArchiveRepository archiveRepository) {
        this.archiveRepository = archiveRepository;
    }

    @Override
    public Optional<ClientCard> findClientCardByName(String name) {
        return archiveRepository.findClientCardByName(name);
    }
}
