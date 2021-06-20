package repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.ClienteDao;

@Repository
public interface ClienteRepository extends PostgreRepository<ClienteDao> {

	List<ClienteDao> findAll();

	ClienteDao findByCliente_ID(Integer Cliente_ID);

	ClienteDao save(ClienteDao cliente);

	ClienteDao update(ClienteDao cliente);

}
