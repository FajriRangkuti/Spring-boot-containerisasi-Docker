package com.mandiri.controller;


import com.mandiri.dto.Course;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ExampleController {

    @GetMapping("/course")
    public List<Course> getCourse(){
        List<Course> course = new ArrayList<>();
        course.add(new Course("Java Fundamental",24));
        course.add(new Course("Java With DB",8));
        course.add(new Course("Golang Fundamental",32));
        course.add(new Course("Golang Using Gin",40));
        course.add(new Course("React JS",88));

        return course;
    }

    @PostMapping("/image")
    public void image(@RequestPart MultipartFile fileNya) throws IOException {
        File file = new File("/upload-image/"+fileNya.getOriginalFilename());
        fileNya.transferTo(file);
    }

    @GetMapping("/environment/{key}")
    public Map<String, String> getEnvironment(@PathVariable String key){

        Map<String,String> map = new HashMap<>();
        map.put("ISINYA",System.getenv(key));
        return map;

    }


}
