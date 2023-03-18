package com.example.fuchuang.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.fuchuang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//为了把mapper这个DAO交给Spring管理，方法里面的内容是从user表中查询所有的数据。

@Mapper
public interface UserMapper extends BaseMapper<User>
 {
    @Select("select * from user")
    List<User> findAll();
}
