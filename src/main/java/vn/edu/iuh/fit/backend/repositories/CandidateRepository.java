package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import vn.edu.iuh.fit.backend.models.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Long> {
//    @Query(value = "SELECT * FROM candidate c ", nativeQuery = true)
//    Iterable<Candidate> findAll();

}
