package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.MovieEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class MovieGenreDTO {

	private static final DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));

	private Long id;

	private String title;

	private Double score;

	private Integer count;

	private String image;

    private String genre;

	public MovieGenreDTO() {

	}

	public MovieGenreDTO(Long id, String title, Double score, Integer count, String image, String genre) {
		this.id = id;
		this.title = title;
		this.score = Double.valueOf(df.format(score));
		this.count = count;
		this.image = image;
        this.genre = genre;
	}

    public MovieGenreDTO(MovieEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.score = Double.valueOf(df.format(entity.getScore()));
        this.count = entity.getCount();
        this.image = entity.getImage();
        this.genre = entity.getGenre().getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
