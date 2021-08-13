package com.gatheringplatform.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gatheringplatform.annotation.ReplyGroups;
import com.sun.org.apache.xpath.internal.operations.Bool;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;

public class Reply {

    private long post_no; // 게시물 번호

    private long reply_no; // 댓글 번호

    private long parent_reply_no; // 부모 댓글의 번호(대댓글일 경우에, 자신의 부모 댓글 번호를 말한다. 만약, root 댓글일 경우에는 0으로 한다.)

    // 내용
    @NotBlank(message = "댓글 내용을 적어주세요.", groups = {ReplyGroups.class})
    private String content;

    // 댓글 쓴 사람의 닉네임
    private String writer_nickname;

    // 댓글 쓴 사람의 ID
    private String writer_id;

    // 작성 시간
//    @DateTimeFormat(pattern = "yyyy-MM-DD'T'HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private Timestamp created_at;

    // 게시물 삭제 여부
    private Boolean is_deleted;

    public long getPost_no() {
        return post_no;
    }

    public void setPost_no(long post_no) {
        this.post_no = post_no;
    }

    public long getReply_no() {
        return reply_no;
    }

    public void setReply_no(long reply_no) {
        this.reply_no = reply_no;
    }

    public long getParent_reply_no() {
        return parent_reply_no;
    }

    public void setParent_reply_no(long parent_reply_no) {
        this.parent_reply_no = parent_reply_no;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public String getWriter_nickname() {
        return writer_nickname;
    }

    public void setWriter_nickname(String writer_nickname) {
        this.writer_nickname = writer_nickname;
    }

    public String getWriter_id() {
        return writer_id;
    }

    public void setWriter_id(String writer_id) {
        this.writer_id = writer_id;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }
}