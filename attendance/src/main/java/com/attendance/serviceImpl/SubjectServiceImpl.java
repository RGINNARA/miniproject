package com.attendance.serviceImpl;

import org.springframework.stereotype.Service;

import com.attendance.entity.Subject;
import com.attendance.repository.SubjectRepository;
import com.attendance.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{
private SubjectRepository subjectRepo;
	@Override
	public Subject addSubject(Subject subject) {
		// TODO Auto-generated method stub
		return subjectRepo.save(subject) ;
	}

	@Override
	public Subject updateSubject(Subject subject) {
		// TODO Auto-generated method stub
		return subjectRepo.save(subject);
	}

	@Override
	public Subject deleteSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.delete(subject);
		return subject;
	}

	}
