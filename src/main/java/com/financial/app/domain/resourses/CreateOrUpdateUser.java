package com.financial.app.domain.resourses;

import com.financial.app.domain.models.UserDataModel;

public interface CreateOrUpdateUser {
    public void execute(UserDataModel user);
}
