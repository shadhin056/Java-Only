package com.category;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({FastClass.class})
@ExcludeCategory({Mediam.class})
@SuiteClasses({ ClassOne.class, ClassTwo.class ,ClassThree.class})
public class AllTests {

}
