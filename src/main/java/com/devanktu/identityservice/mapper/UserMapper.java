package com.devanktu.identityservice.mapper;

import com.devanktu.identityservice.dto.request.UserCreationRequest;
import com.devanktu.identityservice.dto.request.UserUpdateRequest;
import com.devanktu.identityservice.dto.response.UserResponse;
import com.devanktu.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(@MappingTarget User user, UserUpdateRequest request);

}
