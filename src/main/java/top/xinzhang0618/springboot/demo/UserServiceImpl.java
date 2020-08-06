package top.xinzhang0618.springboot.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;
import top.xinzhang0618.springboot.demo.mapper.UserMapper;

/**
 * UserServiceImpl
 *
 * @author xinzhang
 * @author Shenzhen Greatonce Co Ltd
 * @version 2020/5/22
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private TransactionTemplate transactionTemplate;
  @Autowired
  private PlatformTransactionManager transactionManager;
  @Autowired
  private UserMapper userMapper;

  @Override
  public List<User> listAll() {
    return userMapper.listAll();
  }

  @Override
  public Integer insert() {
    DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
    definition.setPropagationBehavior(Propagation.REQUIRED.value());
    definition.setIsolationLevel(TransactionDefinition.ISOLATION_DEFAULT);
    definition.setTimeout(-1);
    TransactionStatus status = transactionManager.getTransaction(definition);

    try {
      Integer i = userMapper.insert();
      // 除0错误演示
      System.out.println(1 / 0);
      this.transactionManager.commit(status);
      return i;
    } catch (Exception var8) {
      this.transactionManager.rollback(status);
      throw var8;
    }
  }

//  @Override
//  public Integer insert() {
//    return transactionTemplate.execute(t -> {
//      try {
//        return userMapper.insert();
//      } catch (Exception e) {
//        t.setRollbackOnly();
//      }
//      return 0;
//    });
//  }

//  @Override
//  public Integer insert() {
//    Integer i = transactionTemplate.execute(new TransactionCallback<Integer>() {
//      @Override
//      public Integer doInTransaction(TransactionStatus transactionStatus) {
//        try {
//          Integer i = userMapper.insert();
//          // 除0错误演示
//          System.out.println(1 / 0);
//          return i;
//        } catch (Exception e) {
//          transactionStatus.setRollbackOnly();
//          return 0;
//        }
//      }
//    });
//    return i;
//  }

//  @Override
//  public Integer insert() {
//    transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//      @Override
//      protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
//        try {
//          userMapper.insert();
//          // 除0错误用以演示
//          System.out.println(1 / 0);
//        } catch (Exception e) {
//          transactionStatus.setRollbackOnly();
//        }
//      }
//    });
//
//    return null;
//  }

}
