package com.neo.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.dto.ShowUserDTO;
import com.neo.dto.UpDateUserDTO;
import com.neo.dto.UserDetailsDTO;
import com.neo.entity.Address;
import com.neo.entity.User;
import com.neo.repository.AddressRepo;
import com.neo.repository.UserRepo;

@Service
public class UserServiceImpl implements IUserService {
	
	private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Autowired
	UserRepo userRepo;

	@Autowired
	AddressRepo addressRepo;

	@Override
	public void createUser(UserDetailsDTO userdetails) {
		String dateTime = formatter.format(new Date(System.currentTimeMillis()));
		User user=new User(userdetails.getUserName(), userdetails.getEmail(), (long) userdetails.getMobile(), "Y", dateTime,
				"system", null, null);
		userRepo.save(user);
		addressRepo.save(new Address(userdetails.getAddress1(), userdetails.getAddress2(), 0, "Y", "Y", dateTime,
				"system", null, null, user));
	}

	@Override
	public void updateUser(UpDateUserDTO user) {
		String dateTime = formatter.format(new Date(System.currentTimeMillis()));
		if(user.isUserDataChanged()) {
			Optional<User> target = userRepo.findById(user.getUserId());
			if (target.isPresent()) {
				User userRef = target.get();
				userRef.setUserName(user.getUserName());
				userRef.setEmail(user.getEmail());
				userRef.setMobile(user.getMobile());
				userRef.setModifiedAt(dateTime);
				userRef.setModifiedBy("user");
				userRepo.save(userRef);
			}
		}
		if (user.isUpdateAddress() || user.isSetAsPrimaryAddress() || user.getAddressIdToBeRemoved() != null) {

			if (user.isUpdateAddress()) {
				// update address
				Optional<Address> target = addressRepo.findById(user.getAddressId());
				if (target.isPresent()) {
					Address addressRef = target.get();
					addressRef.setAddress1(user.getAddress1());
					addressRef.setAddress2(user.getAddress2());
					addressRef.setPincode(user.getPincode());
					addressRef.setModifiedAt(dateTime);
					addressRef.setModifiedBy("user");
					addressRepo.save(addressRef);
				}
			}
			if (user.isSetAsPrimaryAddress()) {
				// make other addresses non-primary
				addressRepo.setAddressAsNonPrimary(user.getUserId());
				// make new address as primary
				addressRepo.setAddressAsPrimary(user.getAddressId());
			}

			if (user.getAddressIdToBeRemoved() != null) {
				addressRepo.deleteAddressAsPrimary(user.getAddressId());
			}
		}
	}

	@Override
	public void deleteUser(Integer userId) {
		userRepo.deleteUser(userId);
		// when users are deleted also delete corresponding address
		addressRepo.deleteAddressForUser(userId);

	}

	@Override
	public ShowUserDTO getUser(String userEmail) throws Exception {
		ShowUserDTO response = new ShowUserDTO();
		// fetch user who is not deleted
		User user = userRepo.getUser(userEmail);
		if (user == null) {
			throw new Exception("incorrect email id");
		}
		response.setUserId(user.getUserId());
		response.setUserName(user.getUserName());
		response.setEmail(userEmail);
		response.setMobile(user.getMobile());

		// fetch address of user which is not deleted
		List<Address> addressForUser = addressRepo.getAddressForUser(user.getUserId());
		response.setUserAddress(addressForUser);

		return response;
		
	}

}
