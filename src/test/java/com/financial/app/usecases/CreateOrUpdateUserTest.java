package com.financial.app.usecases;


import com.financial.app.domain.models.UserDataModel;
import com.financial.app.domain.ports.DatabasePort;
import com.financial.app.domain.usecases.CreateOrUpdateUserUseCase;
import com.financial.app.fixtures.UserDataModelFixture;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CreateOrUpdateUserTest {
    @InjectMocks
    private CreateOrUpdateUserUseCase createOrUpdateUser;

    @Mock
    private DatabasePort databasePort;

    @Test
    void createUserCase() {
        UserDataModel user = UserDataModelFixture.builder().email("Test@gmail.com").build().getMock();
        when(databasePort.findUser(any())).thenReturn(Optional.empty());
        doNothing().when(databasePort).createUser(any());
        createOrUpdateUser.execute(user);
        verify(databasePort, times(1)).createUser(user);
        verify(databasePort, times(1)).findUser("Test@gmail.com");
        verifyNoMoreInteractions(databasePort);
    }

    @Test
    void updateUserCase() {
        UserDataModel user = UserDataModelFixture.builder().email("Test@gmail.com").build().getMock();
        when(databasePort.findUser(any())).thenReturn(Optional.of(user));
        doNothing().when(databasePort).updateUser(any());
        createOrUpdateUser.execute(user);
        verify(databasePort, times(1)).updateUser(user);
        verify(databasePort, times(1)).findUser("Test@gmail.com");
        verifyNoMoreInteractions(databasePort);
    }
}
