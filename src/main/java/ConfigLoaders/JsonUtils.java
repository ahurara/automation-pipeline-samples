package ConfigLoaders;

import Enums.DemoQaEnums;
import com.jayway.jsonpath.InvalidPathException;
import com.jayway.jsonpath.JsonPath;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import java.io.File;
import java.io.IOException;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class JsonUtils {

    private static Map<String  , String > map;

    public static String getValue(DemoQaEnums key , String filepath){
        try{
            return JsonPath.read(new File(filepath), key.toString().toLowerCase());
        }
        catch(IOException e) {
            throw new InvalidPathException("Can't read file, check the config.json");
        }
    }
}
