package com.cagri.springSeries.SpringMongorestApi.DataAccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cagri.springSeries.SpringMongorestApi.Entity.Kullanici;

@Repository
public interface KullaniciRepository extends MongoRepository<Kullanici,String> {

	
	
}
