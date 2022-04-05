package com.example.jpah2demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

  @Autowired
  private ClienteRepository clienteRepository;

  @PostMapping("/addClient")
  public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {	
    return new ResponseEntity<Cliente>(clienteRepository.save(cliente), HttpStatus.OK);
  }

  @GetMapping("/findAllClients")
  public ResponseEntity<List<Cliente>> findAllClients() {
	  return new ResponseEntity<List<Cliente>>(clienteRepository.findAll(), HttpStatus.OK);
  }

  @GetMapping("/findClientById/{id}")
  public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
	  return new ResponseEntity<Cliente>(clienteRepository.getById(idClient), HttpStatus.OK);
  }

  @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
	  clienteRepository.deleteById(idClient);
    }

  @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
	  Cliente clienteById = clienteRepository.getById(id);
	  if(clienteById != null) {
		  clienteById.setEmail(cliente.getEmail());
		  clienteById.setIdade(cliente.getIdade());
		  clienteById.setNome(cliente.getNome());
		  clienteById.setListaEnderecos(cliente.getListaEnderecos());
		  clienteById.setListaTelefones(cliente.getListaTelefones());
	  }
	 
	 clienteRepository.save(clienteById);
    }
}