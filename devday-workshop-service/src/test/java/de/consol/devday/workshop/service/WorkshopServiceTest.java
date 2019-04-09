package de.consol.devday.workshop.service;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class WorkshopServiceTest {

    @Test
    public void testGetEvents() {
        WorkshopService ts = new WorkshopService();
        Assert.assertEquals(2,ts.getEvents().size());
    }

    @Test
    public void testPrefix() {
        Assert.assertEquals(WorkshopService.prefix("blah blah"), "Workshop: blah blah");
    }

}
