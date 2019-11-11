package com.advanced.academy.adventure.books.system.controller;


import com.advanced.academy.adventure.books.system.models.Tag;
import com.advanced.academy.adventure.books.system.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tag")
public class TagControler {

    private final TagService tagService;

    @Autowired
    public TagControler(TagService tagService) {
        this.tagService = tagService;
    }


    @PostMapping
    public void createOrUpdate(@RequestBody Tag tag){
        tagService.createOrUpdate(tag);
    }

    @GetMapping
    public List<Tag> getAll(){
        return tagService.getAllTags();
    }

    @GetMapping("/adventures/{adventureId}")
    public List<Tag> getAllTagsById(@PathVariable("adventureId") Integer adventureId){
        return tagService.getAllTagsByAdventureId(adventureId);
    }

    @GetMapping("/{tagId}")
    public Tag getTags(@PathVariable("tagId") Integer tagId){
        return tagService.getTagById(tagId);
    }


}
