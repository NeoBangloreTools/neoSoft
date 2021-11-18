package com.neo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.neo.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{
	@Query("UPDATE address SET isPrimary = 'N' WHERE userId = ?1")
	public void setAddressAsNonPrimary( Integer userId);

	@Query("UPDATE address SET isPrimary = 'Y' WHERE addressId = ?1")
	public void setAddressAsPrimary( Integer addressId);

	@Query("UPDATE address SET isActive = 'N' WHERE addressId = ?1")
	public void deleteAddressAsPrimary( Integer addressId);

	@Query("UPDATE address SET isActive = 'N' WHERE userId = ?1")
	public void deleteAddressForUser( Integer userId);

	@Query("SELECT a FROM Address a WHERE userId = ?1 AND isActive = 'Y'")
	public List<Address> getAddressForUser( Integer userId);

	@Query("SELECT a FROM Address a WHERE userId = ?1 AND isActive = 'Y' AND isPrimary = 'Y'")
	public Address getPrimaryAddressForUser( Integer userId);

}
