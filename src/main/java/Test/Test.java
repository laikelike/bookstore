package Test;

import bean.UserInfo;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {
    public static void a(){
        InputStream in = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = ssf.openSession();
        UserMapper um = session.getMapper(UserMapper.class);

        List<UserInfo> list = um.findAllUser();
        for (UserInfo ui : list){
            System.out.println(ui);
        }
    }

    public static void main(String[] args) {
        a();
    }
}
