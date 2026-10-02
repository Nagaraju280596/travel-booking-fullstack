package com.travelbooking.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "travel_details")
public class TravelDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false) private String name;
    @Column(nullable=false) private String email;
    @Column(nullable=false) private String phone;
    @Column(nullable=false) private String fromLocation;
    @Column(nullable=false) private String destination;
    @Column(nullable=false) private LocalDate travelDate;
    @Column(nullable=false) private Integer travelers;
    private String travelType;
    @Column(length=1000) private String specialRequests;

    public TravelDetails() {}
    public Long getId(){return id;} public void setId(Long v){id=v;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
    public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
    public String getFromLocation(){return fromLocation;} public void setFromLocation(String v){fromLocation=v;}
    public String getDestination(){return destination;} public void setDestination(String v){destination=v;}
    public LocalDate getTravelDate(){return travelDate;} public void setTravelDate(LocalDate v){travelDate=v;}
    public Integer getTravelers(){return travelers;} public void setTravelers(Integer v){travelers=v;}
    public String getTravelType(){return travelType;} public void setTravelType(String v){travelType=v;}
    public String getSpecialRequests(){return specialRequests;} public void setSpecialRequests(String v){specialRequests=v;}
}
