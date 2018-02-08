package com.pinganzhiyuan.model;

public class TopNav {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column top_nav.id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column top_nav.title
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private String title;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column top_nav.subtitle
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private String subtitle;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column top_nav.icon_url
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private String iconUrl;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column top_nav.url
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column top_nav.id
     * @return  the value of top_nav.id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column top_nav.id
     * @param id  the value for top_nav.id
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column top_nav.title
     * @return  the value of top_nav.title
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column top_nav.title
     * @param title  the value for top_nav.title
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column top_nav.subtitle
     * @return  the value of top_nav.subtitle
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column top_nav.subtitle
     * @param subtitle  the value for top_nav.subtitle
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column top_nav.icon_url
     * @return  the value of top_nav.icon_url
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column top_nav.icon_url
     * @param iconUrl  the value for top_nav.icon_url
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column top_nav.url
     * @return  the value of top_nav.url
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column top_nav.url
     * @param url  the value for top_nav.url
     * @mbg.generated  Wed Feb 07 15:02:36 CST 2018
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public static TopNav convertToModel(Column column) {
        TopNav topNav = new TopNav();
        topNav.setId(column.getId());
        topNav.setTitle(column.getTitle());
        topNav.setIconUrl(column.getIconUrl());
        topNav.setUrl(column.getUrl());
        return topNav;
    }
}