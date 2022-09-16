package com.eapp.service.user.valueObject;

import com.eapp.service.user.entity.UserInfo;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReposeTemplateVo {

    private UserInfo user;
    private Department department;
}
