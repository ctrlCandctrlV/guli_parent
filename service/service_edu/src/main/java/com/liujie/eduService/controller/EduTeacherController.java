package com.liujie.eduService.controller;


import com.liujie.eduService.entity.EduTeacher;
import com.liujie.eduService.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.DeleteProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-07-31
 */
@Api(description = "讲师相关类")
@RestController
@RequestMapping("/eduService/eduTeacher")
public class EduTeacherController {

    @Autowired
    EduTeacherService eduTeacherService;

    //http://localhost:8080/eduService/eduTeacher/findAll
    @ApiOperation(value = "获取讲师列表方法")
    @GetMapping("findAll")
    public List<EduTeacher> findAll(){
        return eduTeacherService.list(null);
    }

    /**
     * 逻辑删除方法
     */
    @ApiOperation(value = "逻辑删除讲师")
    @DeleteMapping("{id}")
    public boolean removeTeacher(
            @ApiParam(name = "id", value = "讲师id", required = true)
            @PathVariable String id){
        boolean result = eduTeacherService.removeById(id);
        return result;
    }

}

