import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

/**
 * Created by Cristian on 1/07/2015.
 */
public class FileUtils {

    File emptyFile;
    File nonExistFile;
    File bigFile;
    File smallFile;
    File smallFileCopy;

    @Before
    public void init(){
        emptyFile = new File("emptyFile");
        nonExistFile = new File("nonExistFile");
        bigFile = new File("bigFile");
        smallFile = new File("smallFile");
        smallFileCopy = new File("smallFileCopy");
    }

    @Test
    public void contentEquals(){

    }

}