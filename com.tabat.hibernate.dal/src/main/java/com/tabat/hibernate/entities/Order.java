package com.tabat.hibernate.entities;
// Generated 17-Jan-2022 19:42:55 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name="order"
    ,catalog="tabatapp"
)
public class Order  implements java.io.Serializable {


     private Integer id;
     private Area area;
     private Consumer consumer;
     private ConsumerAddress consumerAddress;
     private Integer branchId;
     private Date orderAt;
     private float deliveryFees;
     private String status;
     private Set<OrderItem> orderItems = new HashSet<OrderItem>(0);

    public Order() {
    }

	
    public Order(Date orderAt, float deliveryFees, String status) {
        this.orderAt = orderAt;
        this.deliveryFees = deliveryFees;
        this.status = status;
    }
    public Order(Area area, Consumer consumer, ConsumerAddress consumerAddress, Integer branchId, Date orderAt, float deliveryFees, String status, Set<OrderItem> orderItems) {
       this.area = area;
       this.consumer = consumer;
       this.consumerAddress = consumerAddress;
       this.branchId = branchId;
       this.orderAt = orderAt;
       this.deliveryFees = deliveryFees;
       this.status = status;
       this.orderItems = orderItems;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="area_id")
    public Area getArea() {
        return this.area;
    }
    
    public void setArea(Area area) {
        this.area = area;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="consumer_id")
    public Consumer getConsumer() {
        return this.consumer;
    }
    
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="consumer_address_id")
    public ConsumerAddress getConsumerAddress() {
        return this.consumerAddress;
    }
    
    public void setConsumerAddress(ConsumerAddress consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    
    @Column(name="branch_id")
    public Integer getBranchId() {
        return this.branchId;
    }
    
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="order_at", nullable=false, length=19)
    public Date getOrderAt() {
        return this.orderAt;
    }
    
    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    
    @Column(name="delivery_fees", nullable=false, precision=12, scale=0)
    public float getDeliveryFees() {
        return this.deliveryFees;
    }
    
    public void setDeliveryFees(float deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    
    @Column(name="status", nullable=false, length=50)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="order")
    public Set<OrderItem> getOrderItems() {
        return this.orderItems;
    }
    
    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }




}

