package com.meeting.model;

public class Meeting {
    private Integer id;
    private Integer room_id;
    private String name;
    private String start_time;
    private String end_time;
    private Integer count;
    private String reason;
    private String applicant;
    private Integer status;


    public String toString() {
        return "Meeting{" +
                "id=" + id +
                "room_is=" +room_id +
                "name=" + name +
                "start_time=" + start_time +
                "end_time=" + end_time +
                "count=" + count +
                "reason=" + reason +
                "applicant=" + applicant +
                "statue='" + status + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
