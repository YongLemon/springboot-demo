package top.xinzhang0618.springboot.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/22
 */
public interface UserService {

  List<User> listAll();

  Integer insert();
}
