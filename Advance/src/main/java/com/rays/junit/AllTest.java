package com.rays.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Rectangle.class,Circle.class,Shape.class  })
public class AllTest {

}
