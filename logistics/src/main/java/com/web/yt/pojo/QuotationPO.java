package com.web.yt.pojo;

public class QuotationPO {
    private Integer quotationId;

    private Integer stockDetailId;

    private Long receiptCost;

    private Long volumeRate;

    private Long weightRate;

    private String q1;

    private String q2;

    private String q3;

    public Integer getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Integer quotationId) {
        this.quotationId = quotationId;
    }

    public Integer getStockDetailId() {
        return stockDetailId;
    }

    public void setStockDetailId(Integer stockDetailId) {
        this.stockDetailId = stockDetailId;
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

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1 == null ? null : q1.trim();
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2 == null ? null : q2.trim();
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3 == null ? null : q3.trim();
    }
}