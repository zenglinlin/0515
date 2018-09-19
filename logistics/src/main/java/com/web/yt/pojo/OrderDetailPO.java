package com.web.yt.pojo;

public class OrderDetailPO {
    private Integer orderDetailId;

    private Integer orderId;

    private String goodsName;

    private Short amount;

    private String unit;

    private Long unitPrice;

    private Long total;

    private String od1;

    private String od2;

    private String od3;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getOd1() {
        return od1;
    }

    public void setOd1(String od1) {
        this.od1 = od1 == null ? null : od1.trim();
    }

    public String getOd2() {
        return od2;
    }

    public void setOd2(String od2) {
        this.od2 = od2 == null ? null : od2.trim();
    }

    public String getOd3() {
        return od3;
    }

    public void setOd3(String od3) {
        this.od3 = od3 == null ? null : od3.trim();
    }
}