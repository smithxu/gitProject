package baolilai.baolilai.net.requestbean;



import java.util.Map;

import baolilai.baolilai.util.Utils;

public class BaseRequest {
    public Map<String, Object> toMap() {
        return Utils.objectToMap(this);
    }
}
