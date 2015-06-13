package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * To run this test ,  init resources/mysql.sql in advance
 *
 * @author youmoo
 * @since 15/6/12 下午11:26
 */
public class MainTest {

    @Test
    public void test() throws Exception {
        Properties properties =
                Resources.getResourceAsProperties("db.properties");
        SqlSessionManager sqlSessionManager =
                SqlSessionManager.newInstance(
                        Resources.getResourceAsStream("mybatis-config.xml"),
                        properties);

        TestMapper testMapper = sqlSessionManager.getMapper(TestMapper.class);

        Request request = new Request();
        request.setIdList(Arrays.asList(18, 19));

        List<TestModal> flavorOne = testMapper.flavorOne(request);//pass
        List<TestModal> flavorTwo = testMapper.flavorTwo(request);//fail
        Assert.assertTrue("two flavors should be equal", flavorOne.size() == flavorTwo.size());
    }
}
