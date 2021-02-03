package com.example.demo.controller;

import com.example.demo.BaseController;
import com.example.demo.entity.User;
import com.example.demo.exception.RunTimeException;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author THLiu i531384
 */
@RestController
public class DemoController extends BaseController {

    @Autowired
    private DemoService service;

    @Autowired
    private User user;

    @GetMapping("demo")
    public JsonResponse getDemo(@RequestParam String key) {
    
        System.out.println("test031");
        return JsonResponse.builder(200, true, service.getDemo(key), null);

    }


    static class JsonResponse {
        public int code;
        public boolean status;
        public Object data;
        public String mes;

        public JsonResponse(int code, boolean status, Object data, String mes) {
            this.code = code;
            this.status = status;
            this.data = data;
            this.mes = mes;
        }

        public static JsonResponse builder(int code, boolean status, Object data, String mes) {
            return new JsonResponse(code, status, data, mes);
        }
    }
}
