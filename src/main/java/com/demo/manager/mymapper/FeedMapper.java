package com.demo.manager.mymapper;

import com.demo.manager.dao.Feed;
import com.demo.manager.dao.FeedExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FeedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    long countByExample(FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    int deleteByExample(FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    int insert(Feed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    int insertSelective(Feed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    List<Feed> selectByExample(FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    Feed selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    int updateByExampleSelective(@Param("record") Feed record, @Param("example") FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    int updateByExample(@Param("record") Feed record, @Param("example") FeedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    int updateByPrimaryKeySelective(Feed record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feed
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    int updateByPrimaryKey(Feed record);
}