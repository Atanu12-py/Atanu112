package com.company.JobSearch.Controller;

import com.company.JobSearch.Model.Job;
import com.company.JobSearch.Model.Type;
import com.company.JobSearch.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("Jobs")
    public String createJob(@RequestBody Job newJob){
        return jobService.createJob(newJob);
    }

    @GetMapping("Jobs")
    public List<Job> getAllJob(){
        return jobService.getAllJob();
    }

    @DeleteMapping("Jobs/id/{id}")
    public String deleteJob(@PathVariable Long id){
        return jobService.deleteJob(id);
    }

    @GetMapping("Jobs/type/{type}/salary/{salary}")
    public List<Job> getJobByTypeGreaterEqualSalary(@PathVariable Type type, double salary){
        return jobService.getJobByTypeGreaterEqualSalary(type,salary);
    }

    @GetMapping("Jobs/location/{location}")
    public List<Job> getJobByLocation(@PathVariable String location){
        return jobService.getJobByLocation(location);
    }


    @GetMapping("Jobs/type/{type}")
    public List<Job> getJobByType(@PathVariable Type type){
        return jobService.getJobByType(type);
    }

    @PutMapping("Jobs/id/{id}/salary/{salary}")
    public String updateJobByIdSetSalary(@PathVariable Integer id,double salary){
        return jobService.updateJobByIdSetSalary(id,salary);
    }
}
