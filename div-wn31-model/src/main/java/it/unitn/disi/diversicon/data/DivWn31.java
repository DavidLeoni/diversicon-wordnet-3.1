package it.unitn.disi.diversicon.data;

import javax.annotation.Nullable;

import it.unitn.disi.diversicon.BuildInfo;
import it.unitn.disi.diversicon.LexResPackage;

/**
 * Singleton holding references to Wordnet 3.1 files packaged for Diversicon
 * 
 * @since 0.1.0
 *
 */
public class DivWn31 extends LexResPackage {

    /**
     * @since 0.1.0
     */
    public static final String NAME = "div-wn31";
    
    /**
     * 
     * @since 0.1.0
     */
    public static final String LABEL = "Diversicon WordNet 3.1";
    

    /**
     * @since 0.1.0
     */
    public static final String PREFIX = "wn31";    
    
             
    /**
     * @since 0.1.0
     */
    private static final String CLASSPATH = "classpath:/"+NAME + ".lmf";
    
    /**
     * @since 0.1.0
     */
    public static final String SQL_URI = CLASSPATH + ".sql.xz";
    
    /**
     * @since 0.1.0
     */
    public static final String H2DB_URI = CLASSPATH + ".h2.db.xz";
    
    /**
     * @since 0.1.0
     */
    public static final String XML_URI = CLASSPATH + ".xml.xz";    

    /**
     * @since 0.1.0
     */
    public static final String SAMPLE_XML_URI = CLASSPATH + "-sample" + ".xml.xz";    
    
    
    /**
     * @since 0.1.0
     */
    @Nullable
    private static BuildInfo buildInfo;
        
    /**
     * @since 0.1.0
     */
    private static final DivWn31 INSTANCE = new DivWn31();

    
    static {
        INSTANCE.setName(NAME);
        INSTANCE.setLabel(LABEL);
        INSTANCE.setPrefix(PREFIX);
        INSTANCE.setH2DbUri(CLASSPATH + ".h2.db.xz");
        INSTANCE.setSqlUri(CLASSPATH + ".sql.xz");
        INSTANCE.setXmlUri(CLASSPATH + ".xml.xz");
        INSTANCE.setSampleXmlUri(CLASSPATH + "-sample.xml");
                
        if (BuildInfo.hasProperties(DivWn31.class)){
            BuildInfo buildInfo = BuildInfo.of(DivWn31.class);
            INSTANCE.setVersion(buildInfo.getVersion());
            INSTANCE.putNamespace(PREFIX, buildInfo.getScmUrl() );
        } else {            
            throw new IllegalStateException("Couldn't find properties file " + BuildInfo.BUILD_PROPERTIES_PATH + " for class " + DivWn31.class.getCanonicalName());
        }               
    }
       
    /**
     * @since 0.1.0
     */
    public static DivWn31 of(){
        return INSTANCE;
    }
}



