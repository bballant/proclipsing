package proclipsing.processingprovider;

import java.util.ArrayList;

public class ProcessingProvider {
    
    // core should always be gotten.. will handle this better later
    public static String CORE = "core";

    /**
     * Static method gets all libraries in String[] passed to it
     * 
     * @param libNames
     * @return
     */
    public static ProcessingLibrary[] getLibraries(String processingPath, String[] libNames) {
        ArrayList<ProcessingLibrary> libs = new ArrayList<ProcessingLibrary>();
        
        //lil' hack
       // if (!processingPath.contains("sketchbook"))
        //    libs.add(new ProcessingLibrary(processingPath, CORE));
        
        // go team go
        for(String libStr : libNames) {
            libs.add(new ProcessingLibrary(processingPath, libStr));
        }
        
        return libs.toArray(new ProcessingLibrary[libs.size()]);        
    }
    
}
