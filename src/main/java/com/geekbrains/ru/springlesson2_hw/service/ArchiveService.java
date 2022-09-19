package com.geekbrains.ru.springlesson2_hw.service;

import com.geekbrains.ru.springlesson2_hw.domain.ClientCard;

import java.util.Optional;

public interface ArchiveService {

    Optional<ClientCard> findClientCardByName(String name);
}
