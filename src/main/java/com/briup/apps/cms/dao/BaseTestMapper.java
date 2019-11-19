package com.briup.apps.cms.dao;

import com.briup.apps.cms.bean.BaseTest;
import com.briup.apps.cms.bean.BaseTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    long countByExample(BaseTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    int deleteByExample(BaseTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    int insert(BaseTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    int insertSelective(BaseTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    List<BaseTest> selectByExample(BaseTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    BaseTest selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") BaseTest record, @Param("example") BaseTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    int updateByExample(@Param("record") BaseTest record, @Param("example") BaseTestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    int updateByPrimaryKeySelective(BaseTest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbg.generated Tue Nov 19 11:03:52 CST 2019
     */
    int updateByPrimaryKey(BaseTest record);
}