package baolilai.baolilai.net.requestbean;



import java.util.Map;

import baolilai.baolilai.util.Utils;


public class BaseRequest4List {

    private int start=1;
    private int count=10;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Map<String, Object> toMap() {
        return Utils.objectToMap(this);
    }
}
