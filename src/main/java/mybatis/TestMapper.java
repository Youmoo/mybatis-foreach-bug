package mybatis;

import java.util.List;

/**
 * @author youmoo
 * @since 15/6/9 下午5:55
 */
public interface TestMapper {

    List<TestModal> flavorOne(Request request);

    List<TestModal> flavorTwo(Request request);
}
