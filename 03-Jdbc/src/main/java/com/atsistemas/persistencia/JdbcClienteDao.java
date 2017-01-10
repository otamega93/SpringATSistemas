package com.atsistemas.persistencia;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.atsistemas.entidades.Cliente;

@Repository
public class JdbcClienteDao {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	//CRUD
	public void alta(Cliente cliente){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("id", cliente.getId());
		paramMap.put("nombre", cliente.getNombre());
		
		template.update("insert into cliente (id, nombre) values (:id,:nombre)", paramMap);
	}
	
	public void baja(Cliente cliente){
		
	}
	
	public void modificacion(Cliente cliente){
	
	}
	
	public Cliente consultaPorPk(int pk){
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("id", pk);
		
		List<Cliente> resultado = template.query("select * from cliente where id = :id", paramMap, new ClienteRowMapper());
		
		return resultado.get(0);
	}
	
	public Collection<Cliente> consultaTodos(){
		return null;
	}
	
	public Collection<Cliente> consultaPorNombreYPassword(String nombre, String password){
		return null;
	}	
}