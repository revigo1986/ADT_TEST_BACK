package com.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dto.ShowDTO;
import com.entities.Show;
import com.interfaces.Service;
import com.repository.ShowRepository;

@Component
public class ServiceImpl implements Service {
	
	@Autowired
	private ShowRepository showRepository;
	
	@Override
	public List<ShowDTO> findShows(){
		List<Show> listShows = showRepository.findAll();
		List<ShowDTO> listShowsDTO = new ArrayList<ShowDTO>();
		listShows.forEach(show -> {
			ShowDTO showDTO = new ShowDTO(show);
			listShowsDTO.add(showDTO);
		});
		return listShowsDTO;
	}
}
