/**
 * 
 */
package com.crs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crs.entity.CourseCatalog;
import com.crs.entity.GradeCard;
import com.crs.entity.Student;

/**
 * Repository related to GradeCard CRUD operations
 */
@Repository
public interface GradeCardRepository extends CrudRepository<GradeCard, Integer> {

	/**
	 * returns GradeCard related to student and course object
	 * 
	 * @param student
	 * @param catalog
	 * @return GradeCard
	 */
	public GradeCard findByStudentAndCatalog(Student student, CourseCatalog catalog);

}
