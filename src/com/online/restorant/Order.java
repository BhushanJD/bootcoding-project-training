package com.online.restorant;

import java.util.Date;
import java.util.List;

public class Order {
    private long orderId;
    private String itemName;
    private double totalAmount;
    private Vendor vendor;
    private String paymentType;
    private int quantity;
    private String diliveryTime;
    private String dilliveryAssignto;
    private String dilliveryAddress;
    private List<OrderMenuItem> menuItems;
    private  String orderStatus;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    private  Customer customer;

    private Date orderDate;


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDiliveryTime() {
        return diliveryTime;
    }

    public void setDiliveryTime(String diliveryTime) {
        this.diliveryTime = diliveryTime;
    }

    public String getDilliveryAssignto() {
        return dilliveryAssignto;
    }

    public void setDilliveryAssignto(String dilliveryAssignto) {
        this.dilliveryAssignto = dilliveryAssignto;
    }

    public String getDilliveryAddress() {
        return dilliveryAddress;
    }

    public void setDilliveryAddress(String dilliveryAddress) {
        this.dilliveryAddress = dilliveryAddress;
    }

    public List<OrderMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<OrderMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }


}
