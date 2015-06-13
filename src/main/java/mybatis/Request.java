package mybatis;

import java.util.List;

/**
 * @author youmoo
 * @since 15/6/12 下午11:44
 */
public class Request {
    Integer id;
    List<Integer> idList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }
}
