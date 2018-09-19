package com.web.yt.pojo;

public class QuotationDetailPO {
    private Integer quotationDetailId;

    private Integer quotationId;

    private Long accountingVolume;

    private Long accountingWeight;

    private String qd1;

    private String qd2;

    private String qd3;

    public Integer getQuotationDetailId() {
        return quotationDetailId;
    }

    public void setQuotationDetailId(Integer quotationDetailId) {
        this.quotationDetailId = quotationDetailId;
    }

    public Integer getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Integer quotationId) {
        this.quotationId = quotationId;
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

    public String getQd1() {
        return qd1;
    }

    public void setQd1(String qd1) {
        this.qd1 = qd1 == null ? null : qd1.trim();
    }

    public String getQd2() {
        return qd2;
    }

    public void setQd2(String qd2) {
        this.qd2 = qd2 == null ? null : qd2.trim();
    }

    public String getQd3() {
        return qd3;
    }

    public void setQd3(String qd3) {
        this.qd3 = qd3 == null ? null : qd3.trim();
    }
}