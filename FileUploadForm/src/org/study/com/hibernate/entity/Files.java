package org.study.com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "files")
@Table(name = "files")
public class Files {
	@Id
	@Column(name = "id")
	int id;
	@Column(name = "file_name")
	String fileName;
	@Column(name = "caption")
	String caption;
	@Column(name = "label")
	String label;
	public Files() {	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Files(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "Files [id=" + id + ", fileName=" + fileName + ", caption=" + caption + ", label=" + label + "]";
	}	
	
}
