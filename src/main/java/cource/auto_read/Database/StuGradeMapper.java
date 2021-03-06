package cource.auto_read.Database;

import javabean.StuGrade;
import javabean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StuGradeMapper {
    @Insert("insert into StuGrade "
            + "(stu_ID,stu_Name,s_choice,m_choice,judge,t_kong,Q_A,grade,path) "
            + "values "
            + "(#{stu_ID},#{stu_Name},${s_choice},#{m_choice},#{judge},#{t_kong},#{Q_A},#{grade},#{path}) ")
    void addGrade(StuGrade s_grade);

    @Update("update StuGrade set "
            + "s_choice = #{s_choice}, "
            + "m_choice = #{m_choice},  "
            + "judge = #{judge},  "
            + "t_kong = #{t_kong},  "
            + "Q_A = #{Q_A},  "
            + "grade = #{grade},  "
            + "path = #{path} "
            + "where stu_ID = #{stu_ID} ")
    void updateGrade(StuGrade s_grade);

    @Select("Select * from StuGrade where stu_ID=#{stu_ID} ")
    StuGrade selectGradebyID(String stu_ID);

    @Select("Select * from StuGrade order by stu_ID ")
    List<StuGrade> selectAllGrade();

    @Update("truncate table StuGrade")
    void delete();
}
