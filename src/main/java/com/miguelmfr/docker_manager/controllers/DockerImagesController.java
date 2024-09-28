package com.miguelmfr.docker_manager.controllers;

import com.github.dockerjava.api.model.Image;
import com.miguelmfr.docker_manager.services.DockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class DockerImagesController {
    @Autowired
    private DockerService dockerService;

    @GetMapping
    public List<Image> listImages(){
        return dockerService.listImages();
    }

    @GetMapping("/filter")
    public List<Image> filterImagesByName(@RequestParam(required = false, defaultValue = "image-") String filterName){
        return dockerService.filterImages(filterName);
    }
}
