package com.geekbrains.ru.springlesson2_hw.repository;

import com.geekbrains.ru.springlesson2_hw.domain.ClientCard;

import java.util.Optional;

public interface ArchiveRepository {

    Optional<ClientCard> giveClientCard();
}
