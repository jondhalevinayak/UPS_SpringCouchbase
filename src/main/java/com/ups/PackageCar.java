package com.ups;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class PackageCar {

    @Id
    private String id;

    @Field
    private String equipmentNumber;

    @Field
    private String country;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "PackageCar{" + "id='" + this.id + '\'' + ", equipmentNumber='" + this.equipmentNumber + '\''
                + ", country='" + this.country + '\'' + '}';
    }
}