package com.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dto.ShowDTO;

public interface Service {
	List<ShowDTO> findShows();
}
