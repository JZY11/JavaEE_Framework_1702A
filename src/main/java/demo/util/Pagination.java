package demo.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/31.
 * JavaEE_Framework_1702A.
 * pagination 分页
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagination<T extends Serializable> implements Serializable{
    private List<T> list;
    private String statement;
    private int pageSize = Constant.PAGE_SIZE;
    private int totRows;
    private int totalPages;
    private int currentPage;
}
