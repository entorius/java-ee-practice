package lt.vu.mybatis.model;

public class Restaurant {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RESTAURANT.ID
     *
     * @mbg.generated Thu Mar 12 11:58:57 EET 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.RESTAURANT.NAME
     *
     * @mbg.generated Thu Mar 12 11:58:57 EET 2020
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RESTAURANT.ID
     *
     * @return the value of PUBLIC.RESTAURANT.ID
     *
     * @mbg.generated Thu Mar 12 11:58:57 EET 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RESTAURANT.ID
     *
     * @param id the value for PUBLIC.RESTAURANT.ID
     *
     * @mbg.generated Thu Mar 12 11:58:57 EET 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.RESTAURANT.NAME
     *
     * @return the value of PUBLIC.RESTAURANT.NAME
     *
     * @mbg.generated Thu Mar 12 11:58:57 EET 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.RESTAURANT.NAME
     *
     * @param name the value for PUBLIC.RESTAURANT.NAME
     *
     * @mbg.generated Thu Mar 12 11:58:57 EET 2020
     */
    public void setName(String name) {
        this.name = name;
    }
}