package com.senecaGlobal.First_demo_project;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
	@Mock
    MathService mathService;
 
    @InjectMocks
    Calculator mathServiceImpl = new Calculator();
 
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
 
    @Test
    public void test_doubleLong_Pass() {
        long expected = 20;
        Mockito.when(mathService.doublelong(Mockito.anyLong())).thenReturn(expected);
 
        long actual = mathService.doublelong(Mockito.anyLong());
        Assert.assertEquals(expected, actual);
    }
 
    @Test
    public void test_doubleLong_Inject() {
        long expected = 20;
        long actual = mathServiceImpl.doublelong(10);
 
        Assert.assertEquals(expected, actual);
    }
    }

