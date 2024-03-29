package engineering.model;
// Generated Nov 1, 2023, 10:50:55 AM by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Job generated by hbm2java
 */
@Entity
@Table(name = "JOB")
public class Job implements java.io.Serializable {

	private int id;
	private String jobdescr;
	private Double salery;
	private Set<Person> persons = new HashSet<Person>(0);

	public Job() {
	}

	public Job(int id) {
		this.id = id;
	}

	public Job(int id, String jobdescr, Double salery, Set<Person> persons) {
		this.id = id;
		this.jobdescr = jobdescr;
		this.salery = salery;
		this.persons = persons;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "JOBDESCR")
	public String getJobdescr() {
		return this.jobdescr;
	}

	public void setJobdescr(String jobdescr) {
		this.jobdescr = jobdescr;
	}

	@Column(name = "SALERY", precision = 22, scale = 0)
	public Double getSalery() {
		return this.salery;
	}

	public void setSalery(Double salery) {
		this.salery = salery;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "PERSON_JOB", joinColumns = {
			@JoinColumn(name = "jobList_ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "Person_ID", nullable = false, updatable = false) })
	public Set<Person> getPersons() {
		return this.persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

}
