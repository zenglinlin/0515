package com.web.yt.pojo;

public class InStockPO {
    private Integer inStockId;

    private Integer orderId;

    private Integer inUserId;

    private Long receiptCost;

    private Long volumeRate;

    private Long weightRate;

    private Integer warehouseId;

    private String s1;

    private String s2;

    private String s3;

    public Integer getInStockId() {
        return inStockId;
    }

    public void setInStockId(Integer inStockId) {
        this.inStockId = inStockId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getInUserId() {
        return inUserId;
    }

    public void setInUserId(Integer inUserId) {
        this.inUserId = inUserId;
    }

    public Long getReceiptCost() {
        return receiptCost;
    }

    public void setReceiptCost(Long receiptCost) {
        this.receiptCost = receiptCost;
    }

    public Long getVolumeRate() {
        return volumeRate;
    }

    public void setVolumeRate(Long volumeRate) {
        this.volumeRate = volumeRate;
    }

    public Long getWeightRate() {
        return weightRate;
    }

    public void setWeightRate(Long weightRate) {
        this.weightRate = weightRate;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1 == null ? null : s1.trim();
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2 == null ? null : s2.trim();
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3 == null ? null : s3.trim();
    }
}