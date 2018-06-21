package com.ibm.fca.fcaMonitoringRestfulServices.bean;

import java.sql.Timestamp;

public class Stats {
    private AckType ack;
    private String node;
    private String ticketNumber;
    private int count;
    private ITILType type;

    public Stats(AckType ack, String node, String ticketNumber, int count) {
        this.ack = ack;
        this.node = node;
        this.ticketNumber = ticketNumber;
        this.count = count;
        this.type = ITILType.PROBLEM;
    }

    public AckType getAck() {
        return ack;
    }

    public void setAck(AckType ack) {
        this.ack = ack;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ITILType getType() {
        return type;
    }

    public void setType(ITILType type) {
        this.type = type;
    }
}
