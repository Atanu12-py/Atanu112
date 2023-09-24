package com.company.JobSearch.Service;

import com.company.JobSearch.Model.Job;
import com.company.JobSearch.Model.Type;
import com.company.JobSearch.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class JobService {
    @Autowired
    JobRepo iJobRepo;

    public String createJob(Job newJob){
        iJobRepo.save(newJob);
        return "New job created";
    }

    public List<Job> getAllJob(){

        return (List<Job>) iJobRepo.findAll();
    }

    public String deleteJob(Long id){
        iJobRepo.deleteById(id);
        return "Job deleted";
    }

    public List<Job> getJobByTypeGreaterEqualSalary(Type type, double salary){
        return iJobRepo.findByJobTypeAndSalaryGreaterThanEqualOrderBySalaryDesc(type,salary);
    }

    public List<Job> getJobByLocation(String location){
        return iJobRepo.findByLocation(location);
    }

    public List<Job> getJobByType(Type type){
        return iJobRepo.findByJobType(type);
    }

    @Transactional
    public String updateJobByIdSetSalary(Integer id,double salary){
        iJobRepo.updateJobByIdSetSalary(id,salary);
        return "Job updated";
    }
}
