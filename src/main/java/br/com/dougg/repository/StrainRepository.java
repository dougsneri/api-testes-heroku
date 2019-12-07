package br.com.dougg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dougg.entity.Strain;

public interface StrainRepository extends JpaRepository<Strain, Integer>{

}
