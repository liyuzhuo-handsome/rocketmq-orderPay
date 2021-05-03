package com.simpleShop.pojo;

import java.util.Date;

public class MqMessageConsumer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.msg_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private String msgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.group_name
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.msg_tag
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private String msgTag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.msg_key
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private String msgKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.msg_body
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private String msgBody;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.consumer_status
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private Integer consumerStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.consumer_times
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private Integer consumerTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.consumer_timestamp
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private Date consumerTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mq_message_consumer.remark
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.msg_id
     *
     * @return the value of mq_message_consumer.msg_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.msg_id
     *
     * @param msgId the value for mq_message_consumer.msg_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.group_name
     *
     * @return the value of mq_message_consumer.group_name
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.group_name
     *
     * @param groupName the value for mq_message_consumer.group_name
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.msg_tag
     *
     * @return the value of mq_message_consumer.msg_tag
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public String getMsgTag() {
        return msgTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.msg_tag
     *
     * @param msgTag the value for mq_message_consumer.msg_tag
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setMsgTag(String msgTag) {
        this.msgTag = msgTag == null ? null : msgTag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.msg_key
     *
     * @return the value of mq_message_consumer.msg_key
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public String getMsgKey() {
        return msgKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.msg_key
     *
     * @param msgKey the value for mq_message_consumer.msg_key
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setMsgKey(String msgKey) {
        this.msgKey = msgKey == null ? null : msgKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.msg_body
     *
     * @return the value of mq_message_consumer.msg_body
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public String getMsgBody() {
        return msgBody;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.msg_body
     *
     * @param msgBody the value for mq_message_consumer.msg_body
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setMsgBody(String msgBody) {
        this.msgBody = msgBody == null ? null : msgBody.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.consumer_status
     *
     * @return the value of mq_message_consumer.consumer_status
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public Integer getConsumerStatus() {
        return consumerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.consumer_status
     *
     * @param consumerStatus the value for mq_message_consumer.consumer_status
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setConsumerStatus(Integer consumerStatus) {
        this.consumerStatus = consumerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.consumer_times
     *
     * @return the value of mq_message_consumer.consumer_times
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public Integer getConsumerTimes() {
        return consumerTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.consumer_times
     *
     * @param consumerTimes the value for mq_message_consumer.consumer_times
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setConsumerTimes(Integer consumerTimes) {
        this.consumerTimes = consumerTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.consumer_timestamp
     *
     * @return the value of mq_message_consumer.consumer_timestamp
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public Date getConsumerTimestamp() {
        return consumerTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.consumer_timestamp
     *
     * @param consumerTimestamp the value for mq_message_consumer.consumer_timestamp
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setConsumerTimestamp(Date consumerTimestamp) {
        this.consumerTimestamp = consumerTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mq_message_consumer.remark
     *
     * @return the value of mq_message_consumer.remark
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mq_message_consumer.remark
     *
     * @param remark the value for mq_message_consumer.remark
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}