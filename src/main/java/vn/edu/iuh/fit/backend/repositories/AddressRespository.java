package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.backend.models.Address;

public interface AddressRespository extends JpaRepository<Address, Long> {

}
