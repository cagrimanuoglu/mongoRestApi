package com.cagri.springSeries.SpringMongorestApi.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cagri.springSeries.SpringMongorestApi.DataAccess.KullaniciRepository;
import com.cagri.springSeries.SpringMongorestApi.Entity.Kullanici;

@RestController
@RequestMapping("/user")
public class KullaniciApi {

	@Autowired
	private KullaniciRepository kullaniciRepository;
	
	public KullaniciApi(KullaniciRepository kullaniciRepository) {
	
		this.kullaniciRepository = kullaniciRepository;
	}




	@PostMapping
	public ResponseEntity<Kullanici> add(@RequestBody Kullanici kullanici)
	{
		return ResponseEntity.ok(kullaniciRepository.save(kullanici));
		 
	}
	
	 @GetMapping
	public ResponseEntity<List<Kullanici>> getAll()
	{
		return ResponseEntity.ok(kullaniciRepository.findAll());
		 
	}
	
	
}
