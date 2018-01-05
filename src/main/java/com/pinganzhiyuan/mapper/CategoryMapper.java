package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.Category;
import com.pinganzhiyuan.model.CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface CategoryMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    long countByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int deleteByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    @Delete({ "delete from category", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    @Insert({ "insert into category (title)", "values (#{title,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    @Select({ "select", "id, title", "from category", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.CategoryMapper.BaseResultMap")
    Category selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table category
     * @mbg.generated  Fri Jan 05 14:54:42 CST 2018
     */
    @Update({ "update category", "set title = #{title,jdbcType=VARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Category record);
}