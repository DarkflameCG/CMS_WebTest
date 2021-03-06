package com.briup.apps.cms.bean;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_comment.id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_comment.content
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_comment.comment_time
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    private Long commentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_comment.status
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_comment.user_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_comment.article_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    private Long articleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_comment.parent_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    private Long parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_comment.id
     *
     * @return the value of c_comment.id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_comment.id
     *
     * @param id the value for c_comment.id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_comment.content
     *
     * @return the value of c_comment.content
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_comment.content
     *
     * @param content the value for c_comment.content
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_comment.comment_time
     *
     * @return the value of c_comment.comment_time
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public Long getCommentTime() {
        return commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_comment.comment_time
     *
     * @param commentTime the value for c_comment.comment_time
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public void setCommentTime(Long commentTime) {
        this.commentTime = commentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_comment.status
     *
     * @return the value of c_comment.status
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_comment.status
     *
     * @param status the value for c_comment.status
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_comment.user_id
     *
     * @return the value of c_comment.user_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_comment.user_id
     *
     * @param userId the value for c_comment.user_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_comment.article_id
     *
     * @return the value of c_comment.article_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_comment.article_id
     *
     * @param articleId the value for c_comment.article_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_comment.parent_id
     *
     * @return the value of c_comment.parent_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_comment.parent_id
     *
     * @param parentId the value for c_comment.parent_id
     *
     * @mbg.generated Tue Nov 12 17:30:39 CST 2019
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}