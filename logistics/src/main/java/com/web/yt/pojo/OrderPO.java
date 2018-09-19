package com.web.yt.pojo;

public class OrderPO {
    private Integer orderId;

    private Integer salemanId;

    private Integer customId;

    private Integer arriveCountryId;

    private String shippingAddress;

    private String shippingName;

    private String shippingPhone;

    private Integer payTypeId;

    private Integer cargoShippingId;

    private Integer receiptId;

    private String takeName;

    private String takeAddress;

    private String takePhone;

    private String o1;

    private String o2;

    private String o3;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSalemanId() {
        return salemanId;
    }

    public void setSalemanId(Integer salemanId) {
        this.salemanId = salemanId;
    }

    public Integer getCustomId() {
        return customId;
    }

    public void setCustomId(Integer customId) {
        this.customId = customId;
    }

    public Integer getArriveCountryId() {
        return arriveCountryId;
    }

    public void setArriveCountryId(Integer arriveCountryId) {
        this.arriveCountryId = arriveCountryId;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getShippingPhone() {
        return shippingPhone;
    }

    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone == null ? null : shippingPhone.trim();
    }

    public Integer getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(Integer payTypeId) {
        this.payTypeId = payTypeId;
    }

    public Integer getCargoShippingId() {
        return cargoShippingId;
    }

    public void setCargoShippingId(Integer cargoShippingId) {
        this.cargoShippingId = cargoShippingId;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public String getTakeName() {
        return takeName;
    }

    public void setTakeName(String takeName) {
        this.takeName = takeName == null ? null : takeName.trim();
    }

    public String getTakeAddress() {
        return takeAddress;
    }

    public void setTakeAddress(String takeAddress) {
        this.takeAddress = takeAddress == null ? null : takeAddress.trim();
    }

    public String getTakePhone() {
        return takePhone;
    }

    public void setTakePhone(String takePhone) {
        this.takePhone = takePhone == null ? null : takePhone.trim();
    }

    public String getO1() {
        return o1;
    }

    public void setO1(String o1) {
        this.o1 = o1 == null ? null : o1.trim();
    }

    public String getO2() {
        return o2;
    }

    public void setO2(String o2) {
        this.o2 = o2 == null ? null : o2.trim();
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3 == null ? null : o3.trim();
    }
}