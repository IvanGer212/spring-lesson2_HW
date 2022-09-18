package com.geekbrains.ru.springlesson2_hw.repository.Impl;

import com.geekbrains.ru.springlesson2_hw.domain.ClientCard;
import com.geekbrains.ru.springlesson2_hw.repository.ArchiveRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Optional;

@Component
public class ArchiveRepositoryImpl implements ArchiveRepository {

    private ArrayList<ClientCard> clientCards;

    @PostConstruct
    void init(){
        clientCards = new ArrayList<>();
        clientCards.add(new ClientCard(1,"Petrov", "male", 36));
        clientCards.add(new ClientCard(2,"Ivanov", "male", 48));
        clientCards.add(new ClientCard(3,"Smirnova","female",27));
    }

    @Override
    public Optional<ClientCard> findClientCardByName(String clientName) {
        for (ClientCard client: clientCards) {
            if (client.getName()==clientName){
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
