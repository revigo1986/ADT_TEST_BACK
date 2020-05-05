package com.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "SHOWS")
@XmlRootElement
public class Show implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_SHOW")
	private long id;
	
	@Column(name = "SHOW_NAME")
	private String showName;
	
	@Column(name = "SUMMARY")
	private String summary;
	
	@Column(name = "PICTURE")
	private byte[] picture;
	
	@Column(name = "SHOW_CAST")
	private String showCast;
	
	@Column(name = "EPISODE")
	private String episode;
	
	public Show() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getShowCast() {
		return showCast;
	}

	public void setShowCast(String showCast) {
		this.showCast = showCast;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}
}
