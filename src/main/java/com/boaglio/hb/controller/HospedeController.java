package com.boaglio.hb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boaglio.hb.model.Hospede;
import com.boaglio.hb.model.ResultadoREST;
import com.boaglio.hb.repository.HospedeRepository;
import com.boaglio.hb.type.RetornoREST;

@Controller
public class HospedeController {

	@Autowired
	private HospedeRepository repository;

	@RequestMapping(value = "/busca",method = RequestMethod.GET)
	public String busca(@RequestParam("criterioDeBusca") String criterioDeBusca,ModelMap model) {

		if (criterioDeBusca == null) {
			criterioDeBusca = "golpe";
		}
		List<Hospede> hospedes = repository.buscaTodos(criterioDeBusca);
		model.addAttribute("hospedes",hospedes);
		model.addAttribute("criterioDeBusca",criterioDeBusca);
		return "hospedes";

	}

	@RequestMapping(value = "/buscar-por-id/{id}",method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<Object> buscarPorID(@PathVariable(value = "id") String id) {

		Hospede hospede = repository.busca(id);

		if (hospede == null) { return new ResponseEntity<Object>(new ResultadoREST(RetornoREST.registroNaoEncontrado.codigo(),RetornoREST.registroNaoEncontrado.mensagem()),HttpStatus.OK); }

		return new ResponseEntity<Object>(hospede,HttpStatus.OK);

	}
}
