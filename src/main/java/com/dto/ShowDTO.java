package com.dto;

import com.entities.Show;

public class ShowDTO {
	private long id;
	private String showName;
	private String summary;
	private byte[] picture;
	private String showCast;
	private String episode;

	public ShowDTO(Show show) {
		this.id = show.getId();
		this.showName = show.getShowName();
		this.summary = show.getSummary();
		this.picture = show.getPicture();
		this.showCast = show.getShowCast();
		this.episode = show.getEpisode();
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
