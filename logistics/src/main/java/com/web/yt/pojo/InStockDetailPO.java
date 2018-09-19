package com.web.yt.pojo;

public class InStockDetailPO {
    private Integer stockDetailId;

    private Integer inStockId;

    private Integer orderDetailId;

    private Long lonng;

    private Long wide;

    private Long high;

    private Long accountingVolume;

    private Long accountingWeight;

    private String sd1;

    private String sd2;

    private String sd3;

    public Integer getStockDetailId() {
        return stockDetailId;
    }

    public void setStockDetailId(Integer stockDetailId) {
        this.stockDetailId = stockDetailId;
    }

    public Integer getInStockId() {
        return inStockId;
    }

    public void setInStockId(Integer inStockId) {
        this.inStockId = inStockId;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Long getLonng() {
        return lonng;
    }

    public void setLonng(Long lonng) {
        this.lonng = lonng;
    }

    public Long getWide() {
        return wide;
    }

    public void setWide(Long wide) {
        this.wide = wide;
    }

    public Long getHigh() {
        return high;
    }

    public void setHigh(Long high) {
        this.high = high;
    }

    public Long getAccountingVolume() {
        return accountingVolume;
    }

    public void setAccountingVolume(Long accountingVolume) {
        this.accountingVolume = accountingVolume;
    }

    public Long getAccountingWeight() {
        return accountingWeight;
    }

    public void setAccountingWeight(Long accountingWeight) {
        this.accountingWeight = accountingWeight;
    }

    public String getSd1() {
        return sd1;
    }

    public void setSd1(String sd1) {
        this.sd1 = sd1 == null ? null : sd1.trim();
    }

    public String getSd2() {
        return sd2;
    }

    public void setSd2(String sd2) {
        this.sd2 = sd2 == null ? null : sd2.trim();
    }

    public String getSd3() {
        return sd3;
    }

    public void setSd3(String sd3) {
        this.sd3 = sd3 == null ? null : sd3.trim();
    }
}