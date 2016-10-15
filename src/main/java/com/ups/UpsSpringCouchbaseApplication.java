package com.ups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class UpsSpringCouchbaseApplication implements CommandLineRunner {

	@Autowired
	private PackageCarRepository packageCarRepository ;

	public static void main(String[] args) {
		SpringApplication.run(UpsSpringCouchbaseApplication.class);
	}

	@Override
	public void run(String... args) throws Exception {
		//this.packageCarRepository.deleteAll();
		PackageCar packageCar = savePackageCar();
		System.out.println(this.packageCarRepository.findOne(packageCar.getId()));
	}

	private PackageCar savePackageCar() {
		PackageCar packageCar = new PackageCar();
		packageCar.setId(UUID.randomUUID().toString());
		packageCar.setEquipmentNumber("UPSZ9933");
		packageCar.setCountry("US");
		return this.packageCarRepository.save(packageCar);
	}
}
