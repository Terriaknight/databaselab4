package com.demo.manager.mymapper;

import com.demo.manager.dao.Pos;
import com.demo.manager.dao.PosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    long countByExample(PosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int deleteByExample(PosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int insert(Pos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int insertSelective(Pos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    List<Pos> selectByExample(PosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    Pos selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByExampleSelective(@Param("record") Pos record, @Param("example") PosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByExample(@Param("record") Pos record, @Param("example") PosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByPrimaryKeySelective(Pos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pos
     *
     * @mbg.generated Mon Dec 26 23:37:15 CST 2022
     */
    int updateByPrimaryKey(Pos record);
}