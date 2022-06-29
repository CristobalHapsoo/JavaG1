package com.generation.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.generation.models.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long>{
	//JPQL
    //Usamos objeto
	//podemos usar Lazy y Eager 
	    @Query("SELECT a FROM Auto a WHERE a.marca = ?1")
	    List<Auto> findAllAutoMarca(String marca);
		
	//Query comun
	//podemos usar Lazy y Eager 
		@Query(value="SELECT * FROM autos a WHERE a.marca = ?1",nativeQuery = true)
		List<Auto> buscarMarca(String marca);
		
	//filtrar por un alguna columna de la tabla 
	//solo puede traer dato especificos 
		@Query(value="SELECT a.marca, a.color FROM autos a WHERE a.marca = ?1 and a.color=?2",nativeQuery = true)
		List<Object[]> buscarMarcaColor(String marca, String color);
		
		
		//INNER JOIN
		@Query("SELECT a FROM Auto a JOIN a.comprasVentas cv")
		List<Auto> buscarAutosVendidos();
}