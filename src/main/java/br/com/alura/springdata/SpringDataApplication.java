package br.com.alura.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.orm.Cargo;
import br.com.alura.springdata.repository.CargoRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{
	
	 private final CargoRepository cargoRepository;

	 public SpringDataApplication(CargoRepository cargoRepository) {
		 this.cargoRepository = cargoRepository;
	 }

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}
	
	@Override
	public void run (String... args) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setDescricao("DESENVOLVEDOR DE SOFTWARE");
		cargoRepository.save(cargo);
	}
	
	

}
