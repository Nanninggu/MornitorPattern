package com.example.Monitor.Pattern.mapper;

import com.example.Monitor.Pattern.dto.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DepartmentMapper {
    @Update("UPDATE department SET name = #{department.name} WHERE id = #{department.id}")
    void update(@Param("department") Department department);

    @Select("SELECT * FROM public.department_table WHERE id = #{id}")
    Department get(@Param("id") int id);
}
