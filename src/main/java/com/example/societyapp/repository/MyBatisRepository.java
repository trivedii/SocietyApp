package com.example.societyapp.repository;

import com.example.societyapp.model.FlatInfo;
import com.example.societyapp.model.User;
import com.example.societyapp.pojo.UserQueryResult;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MyBatisRepository {
    @Insert("INSERT INTO user_info( name, password, user_type, contact, flat_number) " +
            " VALUES ( #{name}, #{password}, #{userType}, #{contact}, #{flatNumber})")
    public void insertUser(User user);

    @Insert("INSERT INTO flat_info(flat_number, flat_type, carpet_area) " +
            " VALUES (#{flatNumber}, #{flatType}, #{carpetArea})")
    public void insertFlat(FlatInfo flatInfo);

    @Select("Select user_info.user_id, user_info.name, user_info.user_type, user_info.contact, " +
            "user_info.flat_number, flat_info.flat_type, flat_info.carpet_area " +
            "from user_info inner join flat_info " +
            "on user_info.flat_number = flat_info.flat_number  " +
            "where user_info.user_id = #{userId}")
    public UserQueryResult getDetailsById(Long userId);

    @Select("Select user_info.user_id, user_info.name, user_info.user_type, user_info.contact, " +
            "user_info.flat_number, flat_info.flat_type, flat_info.carpet_area " +
            "from user_info inner join flat_info on user_info.flat_number = #{flatNumber}")
    public List<UserQueryResult> findFlatUsers(String flatNumber);

    @Select("SELECT EXISTS(SELECT * from flat_info WHERE flat_number = #{flatNumber})")
    public Boolean flatExists(String flatNumber);
}
