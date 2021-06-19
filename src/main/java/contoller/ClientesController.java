package contoller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.ClienteDao;
import model.Response;
import service.ClienteService;

@RestController
@RequestMapping(value = "/NutriNET/cliente")
public class ClientesController
{
	@Autowired
	private ClienteService clienteService;

	@PostMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<ClienteDao> crearSolicitud(@RequestBody ClienteDao instance)
	{
		return clienteService.creaCliente(instance);
	}

	@GetMapping(value = "/{idCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<List<ClienteDao>> consultaCliente(@PathVariable(required = false) Integer idCliente)
	{
		return clienteService.consultaCliente(idCliente);
	}

	@PostMapping(value = "/{idCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response<ClienteDao> crearSolicitud(@PathVariable Integer idCliente, @RequestBody ClienteDao instance) {
		return clienteService.actualizaCliente(idCliente, instance);
	}
}
