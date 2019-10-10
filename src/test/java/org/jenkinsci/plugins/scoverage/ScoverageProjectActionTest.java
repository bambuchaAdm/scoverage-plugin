package org.jenkinsci.plugins.scoverage;

import hudson.model.AbstractProject;
import org.mockito.Mockito;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoverageProjectActionTest {
    AbstractProject project = Mockito.mock(AbstractProject.class);
    ScoverageProjectAction action = new ScoverageProjectAction(project);

    @Test
    public void urlTest() {
        assertEquals(action.getUrlName(), ActionUrls.PROJECT_URL.toString());
    }

}
