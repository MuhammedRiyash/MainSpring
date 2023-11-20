package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FormEntity {
	@Id
	private String id;
	private	String name;
	private	String date;
	private	String fathers_name;
	private	String mothers_name;
	private	String gender;
	private	String e_mail;
	private	String password;
	private	String confrim_password;
	private	String documents;
	private	String resume;
	private	String level;
	private	String college_name;
	private	String degree_certification;
	private	String textarea;
	private	String signature;
	private	String submit;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFathers_name() {
		return fathers_name;
	}
	public void setFathers_name(String fathers_name) {
		this.fathers_name = fathers_name;
	}
	public String getMothers_name() {
		return mothers_name;
	}
	public void setMothers_name(String mothers_name) {
		this.mothers_name = mothers_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfrim_password() {
		return confrim_password;
	}
	public void setConfrim_password(String confrim_password) {
		this.confrim_password = confrim_password;
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getDegree_certification() {
		return degree_certification;
	}
	public void setDegree_certification(String degree_certification) {
		this.degree_certification = degree_certification;
	}
	public String getTextarea() {
		return textarea;
	}
	public void setTextarea(String textarea) {
		this.textarea = textarea;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	public FormEntity(String id, String name, String date, String fathers_name, String mothers_name, String gender,
			String e_mail, String password, String confrim_password, String documents, String resume, String level,
			String college_name, String degree_certification, String textarea, String signature, String submit) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.fathers_name = fathers_name;
		this.mothers_name = mothers_name;
		this.gender = gender;
		this.e_mail = e_mail;
		this.password = password;
		this.confrim_password = confrim_password;
		this.documents = documents;
		this.resume = resume;
		this.level = level;
		this.college_name = college_name;
		this.degree_certification = degree_certification;
		this.textarea = textarea;
		this.signature = signature;
		this.submit = submit;
	}
	public FormEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
