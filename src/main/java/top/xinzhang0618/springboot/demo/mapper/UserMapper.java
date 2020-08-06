package top.xinzhang0618.springboot.demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.xinzhang0618.springboot.demo.Info;
import top.xinzhang0618.springboot.demo.User;

/**
 * UserMapper
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/20
 */
@Repository
public interface UserMapper {

  List<User> listAll();

  Integer insert();
}
