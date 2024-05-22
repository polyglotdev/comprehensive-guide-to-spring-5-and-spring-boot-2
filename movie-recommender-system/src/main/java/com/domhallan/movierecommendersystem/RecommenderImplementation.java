package com.domhallan.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
  private final Filter filter;

  public RecommenderImplementation(Filter filter) {
    super();
    this.filter = filter;
  }

  public String[] recommendMovies(String movie) {
    System.out.println("Name of filter in use: " + filter.getClass().getName());
    return filter.getRecommendations(movie);
  }
}
