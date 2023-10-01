package com.booking.Service;

import com.booking.payload.UserDTO;
import org.springframework.core.io.InputStreamResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    public UserDTO createUser(UserDTO userDTO);
    public Page<UserDTO> getUsers(Pageable pageable);
    public void deleteUser(Long userId);
    public UserDTO updateUser(Long userId, UserDTO userDTO);
    public InputStreamResource getUserAsExcel();
    public InputStreamResource getUserAsPdf() throws Exception;
    public InputStreamResource getUserCsv();

}
