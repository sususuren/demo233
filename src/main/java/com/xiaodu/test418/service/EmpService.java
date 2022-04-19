package com.xiaodu.test418.service;

import com.xiaodu.test418.pojo.Emp;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaodu.test418.util.R;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xiaodu
 * @since 2022-04-18
 */
public interface EmpService extends IService<Emp> {

    R selectEmpPage(Integer page, Integer limit, Map<String, Object> map);
}
