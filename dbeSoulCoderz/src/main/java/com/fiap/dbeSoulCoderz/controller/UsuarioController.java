package com.fiap.dbeSoulCoderz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.dbeSoulCoderz.dto.DadosRequisicaoUsuario;
import com.fiap.dbeSoulCoderz.model.Usuario;
import com.fiap.dbeSoulCoderz.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;

	@GetMapping("/{id}")
	public ModelAndView usuario(@PathVariable Long id) {
		Usuario usuario = repository.getReferenceById(id);
		ModelAndView mv = new ModelAndView("/usuario/usuario");
		mv.addObject("usuario", usuario);
		return mv;
	}
	
	
	@GetMapping("/formulario")
	public ModelAndView formulario() {
		ModelAndView mv = new ModelAndView("/usuario/formulario");
		return mv;
	}
	
	@PostMapping("/novo")
	@Transactional
	public ModelAndView novo(DadosRequisicaoUsuario requisicao) {
		Usuario usuario = new Usuario(requisicao);
		repository.save(usuario);
		Long id = usuario.getIdUsuario();
		ModelAndView mv = new ModelAndView("redirect:/usuario/"+id);
		return mv;
	}
}
