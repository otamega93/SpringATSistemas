package com.cursospring.modelo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospring.modelo.entidades.Usuario;
import com.cursospring.modelo.negocio.PortalParejasNegocio;
import com.cursospring.modelo.persistencia.UsuarioDao;

@Service
public class PortalParejasServicioImpl implements PortalParejasServicio{

	@Autowired
	private UsuarioDao dao;
	
	@Autowired
	private PortalParejasNegocio negocio;
	
	public void setDao(UsuarioDao dao) {
		this.dao = dao;
	}

	public void setNegocio(PortalParejasNegocio negocio) {
		this.negocio = negocio;
	}

	public void registrar(Usuario usuario) {
		dao.saveAndFlush(usuario);
	}

	public Usuario loguear(String nombre, String password) {
		return dao.findByNombreAndPassword(nombre, password);
	}

	public List<Usuario> buscarAfin(Usuario elQueBusca) {
		return negocio.buscarUsuariosAfinesAUsuario(elQueBusca);
	}

	public Usuario buscarIdeal(Usuario elQueBusca) {
		return negocio.buscarIdeal(elQueBusca);
	}

}
