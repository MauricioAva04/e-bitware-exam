package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.ClienteDao;
import model.Response;
import repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public Response<ClienteDao> creaCliente(ClienteDao cliente) {
		Response<ClienteDao> response = new Response<>();
		try {
			response.setResultset(clienteRepository.save(cliente));
			response.setCve_Error("0");
			response.setCve_Mensaje("Cliente guardado correctamente");
		} catch (Exception e) {
			response.setCve_Error("1");
			response.setCve_Mensaje("Error al guardar el cliente  " + e.getMessage());
		}

		return response;
	}

	public Response<List<ClienteDao>> consultaCliente(Integer id) {
		Response<List<ClienteDao>> response = new Response<>();
		List<ClienteDao> clientes = new ArrayList<>();
		try {

			if (null == id) {
				clientes = clienteRepository.findAll();
			} else {
				clientes.add(clienteRepository.findByCliente_ID(id));
			}

			response.setResultset(clientes);
			response.setCve_Error("0");
			response.setCve_Mensaje("Cliente encontrado");
		} catch (Exception e) {
			response.setCve_Error("1");
			response.setCve_Mensaje("Error al consultar el cliente  " + e.getMessage());
		}

		return response;
	}

	public Response<ClienteDao> actualizaCliente(Integer id, ClienteDao instance) {
		Response<ClienteDao> response = new Response<>();
		try {
			ClienteDao cliente = clienteRepository.findByCliente_ID(id);
			cliente.setNombre(null == instance.getNombre() ? cliente.getNombre() : instance.getNombre());
			cliente.setApellidos(null == instance.getApellidos() ? cliente.getApellidos() : instance.getApellidos());
			cliente.setCorreo_Electronico(null == instance.getCorreo_Electronico() ? cliente.getCorreo_Electronico()
					: instance.getCorreo_Electronico());
			cliente.setEdad(null == instance.getEdad() ? cliente.getEdad() : instance.getEdad());
			cliente.setEstatura(null == instance.getEstatura() ? cliente.getEstatura() : instance.getEstatura());
			cliente.setPeso(null == instance.getPeso() ? cliente.getPeso() : instance.getPeso());
			cliente.setIMC(null == instance.getIMC() ? cliente.getIMC() : instance.getIMC());
			cliente.setGEB(null == instance.getGEB() ? cliente.getGEB() : instance.getGEB());
			cliente.setETA(null == instance.getETA() ? cliente.getETA() : instance.getETA());
			cliente.setFecha_Actualizacion(new Date());

			clienteRepository.update(cliente);
			response.setResultset(cliente);
			response.setCve_Error("0");
			response.setCve_Mensaje("Cliente actualizado correctamente");
		} catch (Exception e) {
			response.setCve_Error("1");
			response.setCve_Mensaje("Error al actualizar el cliente  " + e.getMessage());
		}

		return response;
	}
}