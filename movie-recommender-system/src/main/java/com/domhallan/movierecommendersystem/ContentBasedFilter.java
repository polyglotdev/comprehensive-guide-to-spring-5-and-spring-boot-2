package com.domhallan.movierecommendersystem;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
  public String[] getRecommendations(String movie) {
    return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
  }
}
