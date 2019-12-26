package mapper;

import bean.UserInfo;

import java.util.List;

public interface UserMapper {
    public List<UserInfo> findAllUser();
}
