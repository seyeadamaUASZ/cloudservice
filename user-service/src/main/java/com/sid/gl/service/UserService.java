package com.sid.gl.service;

import com.sid.gl.VO.Departement;
import com.sid.gl.VO.ResponseTemplateVO;
import com.sid.gl.entity.User;
import com.sid.gl.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Service
@Slf4j
public class UserService {
    private UserRepository userRepository;
    private RestTemplate restTemplate;

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartement(Long userId){
      log.info("inside get user with departement");
      ResponseTemplateVO vo = new ResponseTemplateVO();
      User user = userRepository.findById(userId).get();
        Departement departement = restTemplate.getForObject("http://DEPARTEMENT-SERVICE/departements/"+user.getDepartementId(),Departement.class);
        vo.setUser(user);
        vo.setDepartement(departement);
        return vo;
    }
}
