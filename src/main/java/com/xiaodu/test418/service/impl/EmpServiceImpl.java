package com.xiaodu.test418.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaodu.test418.pojo.Emp;
import com.xiaodu.test418.dao.EmpMapper;
import com.xiaodu.test418.service.EmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaodu.test418.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author xiaodu
 * @since 2022-04-18
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public R selectEmpPage(Integer page, Integer limit, Map<String, Object> map) {
        LambdaQueryWrapper<Emp> wrapper = new LambdaQueryWrapper<>();
        if (null != map.get("name")) {
            wrapper.like(Emp::getName, map.get("name"));
        }
        if (null != map.get("age")) {
            wrapper.eq(Emp::getAge, map.get("age"));
        }
        return R.ok("查询成功").put("emp", empMapper.selectPage(new Page<>(page, limit), wrapper));
    }
}
