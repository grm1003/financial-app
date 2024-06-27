package com.financial.app.domain.resourses;

import com.financial.app.domain.entitys.UserDataModel;
import com.financial.app.infraestructure.database.entity.UserEntity;

public interface UpdateUser {
    public void updateUser(UserDataModel user);

}
