package com.demo.manager.dao;

public class Character {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column character.id
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column character.character
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    private String character;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column character.id
     *
     * @return the value of character.id
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column character.id
     *
     * @param id the value for character.id
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column character.character
     *
     * @return the value of character.character
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    public String getCharacter() {
        return character;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column character.character
     *
     * @param character the value for character.character
     *
     * @mbg.generated Thu Dec 15 16:07:49 CST 2022
     */
    public void setCharacter(String character) {
        this.character = character;
    }
}