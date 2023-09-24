package com.company.JobSearch.Repo;

import com.company.JobSearch.Model.Job;
import com.company.JobSearch.Model.Type;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends CrudRepository<Job,Long> {
    List<Job> findByJobTypeAndSalaryGreaterThanEqualOrderBySalaryDesc(Type type, double salary);
    List<Job> findByLocation(String location);

    List<Job> findByJobType(Type type);

    @Modifying
    @Query(value = "UPDATE JOB_PORTAL SET SALARY=:salary WHERE ID=:id",nativeQuery = true)
    void updateJobByIdSetSalary(Integer id,double salary);
}
