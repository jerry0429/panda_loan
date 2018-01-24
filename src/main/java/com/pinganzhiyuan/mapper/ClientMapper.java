package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.Client;
import com.pinganzhiyuan.model.ClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ClientMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    long countByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    int deleteByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    @Delete({ "delete from client", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    @Insert({ "insert into client (user_id, name, ", "identity_no, residence_addr, ", "is_man, nation, birthday, ",
            "identity_auth, identity_expiration, ", "education, guarantee, ", "profession)",
            "values (#{userId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
            "#{identityNo,jdbcType=VARCHAR}, #{residenceAddr,jdbcType=VARCHAR}, ",
            "#{isMan,jdbcType=BIT}, #{nation,jdbcType=VARCHAR}, #{birthday,jdbcType=DATE}, ",
            "#{identityAuth,jdbcType=VARCHAR}, #{identityExpiration,jdbcType=DATE}, ",
            "#{education,jdbcType=VARCHAR}, #{guarantee,jdbcType=VARCHAR}, ", "#{profession,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Client record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    int insertSelective(Client record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    List<Client> selectByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    @Select({ "select", "id, user_id, name, identity_no, residence_addr, is_man, nation, birthday, identity_auth, ",
            "identity_expiration, education, guarantee, profession", "from client",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.ClientMapper.BaseResultMap")
    Client selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    int updateByPrimaryKeySelective(Client record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table client
     * @mbg.generated  Wed Jan 24 17:29:12 CST 2018
     */
    @Update({ "update client", "set user_id = #{userId,jdbcType=BIGINT},", "name = #{name,jdbcType=VARCHAR},",
            "identity_no = #{identityNo,jdbcType=VARCHAR},", "residence_addr = #{residenceAddr,jdbcType=VARCHAR},",
            "is_man = #{isMan,jdbcType=BIT},", "nation = #{nation,jdbcType=VARCHAR},",
            "birthday = #{birthday,jdbcType=DATE},", "identity_auth = #{identityAuth,jdbcType=VARCHAR},",
            "identity_expiration = #{identityExpiration,jdbcType=DATE},", "education = #{education,jdbcType=VARCHAR},",
            "guarantee = #{guarantee,jdbcType=VARCHAR},", "profession = #{profession,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Client record);
}