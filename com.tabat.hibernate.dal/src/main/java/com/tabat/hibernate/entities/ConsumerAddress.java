package com.tabat.hibernate.entities;
// Generated 17-Jan-2022 19:42:55 by Hibernate Tools 4.3.1


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

/**
 * ConsumerAddress generated by hbm2java
 */
@Entity
@Table(name="consumer_address"
    ,catalog="tabatapp"
)
public class ConsumerAddress  implements java.io.Serializable {


     private Integer id;
     private Area area;
     private Consumer consumer;
     private String street;
     private String building;
     private String floor;
     private String flat;
     private String landmark;
     private byte active;
     private Set<Order> orders = new HashSet<Order>(0);

    public ConsumerAddress() {
    }

	
    public ConsumerAddress(String street, String building, String floor, byte active) {
        this.street = street;
        this.building = building;
        this.floor = floor;
        this.active = active;
    }
    public ConsumerAddress(Area area, Consumer consumer, String street, String building, String floor, String flat, String landmark, byte active, Set<Order> orders) {
       this.area = area;
       this.consumer = consumer;
       this.street = street;
       this.building = building;
       this.floor = floor;
       this.flat = flat;
       this.landmark = landmark;
       this.active = active;
       this.orders = orders;
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

    
    @Column(name="street", nullable=false, length=45)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="building", nullable=false, length=5)
    public String getBuilding() {
        return this.building;
    }
    
    public void setBuilding(String building) {
        this.building = building;
    }

    
    @Column(name="floor", nullable=false, length=25)
    public String getFloor() {
        return this.floor;
    }
    
    public void setFloor(String floor) {
        this.floor = floor;
    }

    
    @Column(name="flat", length=100)
    public String getFlat() {
        return this.flat;
    }
    
    public void setFlat(String flat) {
        this.flat = flat;
    }

    
    @Column(name="landmark", length=100)
    public String getLandmark() {
        return this.landmark;
    }
    
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    
    @Column(name="active", nullable=false)
    public byte getActive() {
        return this.active;
    }
    
    public void setActive(byte active) {
        this.active = active;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="consumerAddress")
    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }




}

