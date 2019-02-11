package org.study.com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity(name = "files")
	@Table(name = "files")
	public class File {
			@Id
			@Column(name = "id")
			int id;
			@Column(name = "file_name")
			String fileName;
			@Column(name = "caption")
			String caption;
			@Column(name = "label")
			String label;
			public File() {
				
			}
			public File(String fileName) {
				super();
				this.fileName = fileName;
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
			
			
	}

