package com.xiaodu.test418.controller;


import com.xiaodu.test418.pojo.Emp;
import com.xiaodu.test418.service.EmpService;
import com.xiaodu.test418.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaodu
 * @since 2022-04-18
 */
@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/")
    @ApiOperation(value = "多条件分页查询")
    public R selectEmpPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit, @RequestParam Map<String, Object> map) {
        return empService.selectEmpPage(page, limit, map);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "通过id查询")
    public R selectEmpById(@PathVariable Integer id) {
        return R.ok().put("emp", empService.getById(id));
    }

    @PostMapping("/")
    @ApiOperation(value = "增加员工")
    public R addEmp(@RequestParam Emp emp) {
        if (empService.save(emp)) {
            return R.ok("增加成功");
        }
        return R.error("增加失败");
    }

    @PutMapping("/")
    @ApiOperation(value = "修改员工")
    public R updateEmp(@RequestParam Emp emp) {
        if (empService.updateById(emp)) {
            return R.ok("修改成功");
        }
        return R.error("修改失败");
    }

    @DeleteMapping("/")
    @ApiOperation(value = "删除员工")
    public R deleteEmpById(@RequestParam Integer id) {
        if (empService.removeById(id)) {
            return R.ok("删除成功");
        }
        return R.error("删除失败");
    }
}
