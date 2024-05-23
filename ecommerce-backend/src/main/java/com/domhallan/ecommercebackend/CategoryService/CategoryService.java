package com.domhallan.ecommercebackend.CategoryService;

import com.domhallan.ecommercebackend.Category;
import com.domhallan.ecommercebackend.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
  @Autowired
  private CategoryRepository categoryRepository;

  public Category readCategory(String categoryName) {
    return categoryRepository.findByCategoryName(categoryName);
  }

  public void createCategory(Category category) {
    categoryRepository.save(category);
  }
}
