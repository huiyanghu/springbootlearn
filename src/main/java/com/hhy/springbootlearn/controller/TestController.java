package com.hhy.springbootlearn.controller;

import com.alibaba.fastjson.JSON;
import com.hhy.springbootlearn.GirlProperties;
import com.hhy.springbootlearn.domain.Girl;
import com.hhy.springbootlearn.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Properties;

/**
 * Created by hhy on 17/7/10.
 */
@RestController
public class TestController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    GirlProperties girlProperties;

    @Autowired
    GirlRepository girlRepository;


    //@RequestMapping(value = "/sayMyId", method = RequestMethod.GET)
    @GetMapping("/sayMyId")
    public String sayMyId(@RequestParam(value = "id", required = false, defaultValue = "666") Integer myId) {
        return "id:" + myId;
    }

    @RequestMapping(value = "/{id}/say", method = RequestMethod.GET)
    public String sayId(@PathVariable(value = "id") Integer myId) {
        return "id:" + myId;
    }

    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    public String sayGirl() {
        return girlProperties.getCupSize() + girlProperties.getAge();
    }

    /**
     * 查询所有数据
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> getGirlList() {
        return girlRepository.findAll();
    }

    /**
     * 添加
     *
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(String cupSize, Integer age) {
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    /**
     * id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable Integer id) {
        return girlRepository.findOne(id);
    }

    /**
     * 更新
     *
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PutMapping(value = "/girls")
    public Girl girlUpdate(Integer id, String cupSize, Integer age) {
        Girl girl = girlRepository.findOne(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 删除
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable Integer id) {
        girlRepository.delete(id);
    }


    @RequestMapping("/toTest")
    public ModelAndView toTest(HttpSession session){
        System.out.println(1/0);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("girl/test");
        return mv;
    }
}
