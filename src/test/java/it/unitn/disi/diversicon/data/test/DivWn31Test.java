package it.unitn.disi.diversicon.data.test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.unitn.disi.diversicon.data.DivWn31;

public class DivWn31Test {
    
    private static final Logger LOG = LoggerFactory.getLogger(DivWn31Test.class);          
    
    @Test
    public void test(){
        assertFalse(DivWn31.of().getVersion().isEmpty());
        LOG.debug(DivWn31.of().getVersion());
        assertFalse(DivWn31.of().getVersion().isEmpty());  // double so we check build info init
        assertFalse(DivWn31.of().getH2DbUri().isEmpty());
        assertFalse(DivWn31.of().getSqlUri().isEmpty());
        assertFalse(DivWn31.of().getXmlUri().isEmpty());
    }
}
