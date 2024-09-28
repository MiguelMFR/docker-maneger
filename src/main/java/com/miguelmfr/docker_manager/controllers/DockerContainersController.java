package com.miguelmfr.docker_manager.controllers;

import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Image;
import com.miguelmfr.docker_manager.services.DockerService;
import jakarta.ws.rs.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/containers")
public class DockerContainersController {
    @Autowired
    private DockerService dockerService;

    @GetMapping()
    public List<Container> listContainers(@RequestParam(required = false, defaultValue = "true") boolean showAll){
        return dockerService.listContainer(showAll);
    }

    @PostMapping("/{id}/start")
    public void startContainer(@PathVariable String id){
        dockerService.startContainer(id);
    }

    @PostMapping("/{id}/stop")
    public void stopContainer(@PathVariable String id){
        dockerService.stopContainer(id);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteContainer(@PathVariable String id){
        dockerService.deleteContainer(id);
    }

    @PostMapping()
    public void createContainer(@RequestParam String imageName){
        dockerService.createContainer(imageName);
    }
}
