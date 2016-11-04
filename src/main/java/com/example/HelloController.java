package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wuhang")
public class HelloController {

    @RequestMapping
    public String hello() {
        return "Hello Spring-Boot";
    }

//    @RequestMapping("/info") 
//    public Map<String, String> getInfo(@RequestParam String name) {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("name", name);
//        return map;
//    }
//
//    @SuppressWarnings("unchecked")
//	@RequestMapping("/list")
//    public List<String> getList() {
//    	List<String> list = new ArrayList<String>();
//        HashMap<String,String> map = null;
//        for (int i = 1; i <= 5; i++) {
//            map = new HashMap<String, String>();
//            map.put("name", "Shanhy-" + i);
//            list.addAll((Collection<? extends String>) map);
//        }
//        return list;
//    }
}