package com.financial.app.infraestructure.database;

import com.financial.app.domain.entitys.CashFlow;
import com.financial.app.domain.entitys.UserDataModel;
import com.financial.app.domain.ports.DatabasePort;
import com.financial.app.infraestructure.database.entity.FlowEntity;
import com.financial.app.infraestructure.database.entity.UserEntity;
import com.financial.app.infraestructure.database.repository.FlowRepository;
import com.financial.app.infraestructure.database.repository.UserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DatabaseAdapter implements DatabasePort {
    private final FlowRepository flowRepository;
    private final UserRepository userRepository;

    @Override
    public void saveCash(CashFlow cashFlow) {
        flowRepository.save(new FlowEntity(cashFlow));
    }

    @Override
    public Optional<UserDataModel> findUser(String email) {
        return userRepository.findById(email).map(UserEntity::toEntity);
    }

    @Override
    public void updateUser(UserDataModel user) {
        userRepository.save(new UserEntity(user));
    }

    @Override
    public List<UserDataModel> findAllUsers() {
        return userRepository.findAll().stream().map(UserEntity::toEntity).collect(Collectors.toList());
    }

    @Override
    public Optional<UserDataModel> createUser(UserDataModel user) {
        return Optional.of(userRepository.save(new UserEntity(user)).toEntity());
    }

    @Override
    public void deleteUser(String email) {
        userRepository.deleteById(email);
    }
}
