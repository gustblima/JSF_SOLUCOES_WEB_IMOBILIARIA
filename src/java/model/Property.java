/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gustavo
 */
@Entity
public class Property implements Serializable{
    @Id
    @GeneratedValue()
    @Column(name = "property_id")
    private Integer id;
   
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User owner;
    

    
    private BigDecimal  salePrice;
    
    
    private BigDecimal dailyRentPrice;
    
   
    private boolean isRentable;
    
   
    private boolean isVendible;
    
    
    private Double squareMeter;
    private String description;
    
    private Integer bathrooms;
    private Integer bedrooms;
    private Integer parkingSlot;
    
    @ManyToOne
    private Category category;
    
    @OneToMany
    private Collection<Photo> photos;
	
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    
  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getDailyRentPrice() {
        return dailyRentPrice;
    }

    public void setDailyRentPrice(BigDecimal dailyRentPrice) {
        this.dailyRentPrice = dailyRentPrice;
    }

    public boolean isIsRentable() {
        return isRentable;
    }

    public void setIsRentable(boolean isRentable) {
        this.isRentable = isRentable;
    }

    public boolean isIsVendible() {
        return isVendible;
    }

    public void setIsVendible(boolean isVendible) {
        this.isVendible = isVendible;
    }

    public Double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(Double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(Integer parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Category getCategoriy() {
        return category;
    }

    public void setCategoriy(Category categoriy) {
        this.category = categoriy;
    }

    public Collection<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Collection<Photo> photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    
}
