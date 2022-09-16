package com.greatlearning.student.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.greatlearning.student.entity.Student;

@Repository
public class StudentServiceImpl implements StudentService{
	
	private SessionFactory sessionFactory;
		private Session session;
	
	StudentServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		}catch(HibernateException ex) {
			session = sessionFactory.openSession();
		}
	}

	@Transactional
	public List<Student> findAll() {
		Transaction tx = session.beginTransaction();
		List<Student> stud = session.createQuery("from Student").list();
		tx.commit();
		return stud;
	}

	@Transactional
	public Student getStudentById(int id) {
		Student stud = new Student();
		Transaction tx = session.beginTransaction();
		stud =  session.get(Student.class, id);
		tx.commit();
		return stud;
	}

	@Transactional
	public void deletStudentById(int id) {
		Student stud = new Student();
		Transaction tx = session.beginTransaction();
		stud = session.get(Student.class,id);
		session.delete(stud);
		tx.commit();
	}

	@Override
	public void save(Student thestud) {
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(thestud);
		tx.commit();
	}

}
