package com.dms.service.category;

import com.dms.model.Category;
import com.dms.service.IGeneralService;

public interface ICategoryService extends IGeneralService<Category> {
    void softDelete(Category category);

    Category findCatetoryByName(String name);
}
