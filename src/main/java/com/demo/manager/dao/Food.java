package com.demo.manager.dao;

public class Food {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.id
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food.food
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    private String food;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.id
     *
     * @return the value of food.id
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.id
     *
     * @param id the value for food.id
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food.food
     *
     * @return the value of food.food
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    public String getFood() {
        return food;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food.food
     *
     * @param food the value for food.food
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    public void setFood(String food) {
        this.food = food;
    }
}