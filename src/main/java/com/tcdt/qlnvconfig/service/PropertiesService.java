package com.tcdt.qlnvconfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcdt.qlnvconfig.model.Properties;
import com.tcdt.qlnvconfig.repository.PropertiesRepository;

/**
 * @author hoanglb
 *
 */
@RestController
@RequestMapping("/api")
public class PropertiesService {

	@Autowired
	private PropertiesRepository repository;

	@GetMapping("/props")
	public Iterable<Properties> getAll() {
		return repository.findAll();
	}

	@GetMapping("/props/{application}")
	public Iterable<Properties> get(@PathVariable() String application) {
		return repository.findByApplication(application);
	}

	@GetMapping("/props/{application}/{profile}")
	public Iterable<Properties> get(@PathVariable() String application, @PathVariable() String profile) {
		return repository.findByApplicationAndProfile(application, profile);
	}

	@GetMapping("/props/{application}/{profile}/{label}")
	public Iterable<Properties> get(@PathVariable() String application, @PathVariable() String profile,
			@PathVariable() String label) {
		return repository.findByApplicationAndProfileAndLabel(application, profile, label);
	}

	@GetMapping("/props/{application}/{profile}/{label}/{key}")
	public Iterable<Properties> get(@PathVariable() String application, @PathVariable() String profile,
			@PathVariable() String label, @PathVariable() String key) {
		return repository.findByApplicationAndProfileAndLabelAndKey(application, profile, label, key);
	}
}
