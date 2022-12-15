package com.demo.manager.mapper;

import com.demo.manager.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @InterfaceName AdminMapper.java
 * @Description TODO
 * @createTime 2022年06月02日 16:56:00
 */
@Mapper
public interface AdminMapper {
    User getuser(Integer id);
    Integer adduser(User user);
    List<Cat> listallcat();
    Integer addcat(Cat cat);

    Integer addcheck(Check check);

    Integer addFeedInfo(Feed feed);
}
