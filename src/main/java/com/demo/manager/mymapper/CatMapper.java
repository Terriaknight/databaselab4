package com.demo.manager.mymapper;

import com.demo.manager.dao.Cat;
import com.demo.manager.dao.CatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    long countByExample(CatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int deleteByExample(CatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int insert(Cat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int insertSelective(Cat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    List<Cat> selectByExample(CatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    Cat selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByExampleSelective(@Param("record") Cat record, @Param("example") CatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByExample(@Param("record") Cat record, @Param("example") CatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByPrimaryKeySelective(Cat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cat
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByPrimaryKey(Cat record);
}