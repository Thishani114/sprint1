package com.example.collegeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeController {

    @Autowired
    private CollgeService collegeService;

    @GetMapping("/college")
    public List<College> getAllColleges() {
        return collegeService.getAllCollege();
    }

    @GetMapping("/college/{id}")
    public College getCollgeById(@PathVariable Long id) {
        return collegeService.getCollegeById(id);
    }

    @PostMapping("/college")
    public College createCollege(@RequestBody College college) {
        return collegeService.addCollege(college);
    }
    
    @PutMapping("/college/{id}")
    public College updateCollege(@PathVariable Long id,@RequestBody College college) {
    	return collegeService.updateCollege(id, college);
    }
   

    @DeleteMapping("/college/{id}")
    public void deleteCollege(@PathVariable Long id) {
        collegeService.deleteCollege(id);
    }
}

