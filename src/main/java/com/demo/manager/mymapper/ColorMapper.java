package com.demo.manager.mymapper;

import com.demo.manager.dao.Color;
import com.demo.manager.dao.ColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    long countByExample(ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int deleteByExample(ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int insert(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int insertSelective(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    List<Color> selectByExample(ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    Color selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByExampleSelective(@Param("record") Color record, @Param("example") ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByExample(@Param("record") Color record, @Param("example") ColorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByPrimaryKeySelective(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByPrimaryKey(Color record);
}