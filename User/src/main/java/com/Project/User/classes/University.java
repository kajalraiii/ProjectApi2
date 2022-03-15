package com.Project.User.classes;

import com.Project.User.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {
    private User user;
    private School school;
}
