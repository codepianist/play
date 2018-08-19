package data;

import com.google.common.collect.Lists;
import model.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRepository {

    private static Map<Long, Test> MOCKED_DB = new HashMap(){{
        put(1L, "Test 1");
        put(3L, "Test 3");
        put(4L, "Test 4");
        put(9L, "Test 9");
    }};

    public void add(Test test){
        MOCKED_DB.put(test.getID(), test);
    }

    public boolean remove(Long ID){
        if(MOCKED_DB.get(ID)!=null){
            MOCKED_DB.remove(ID);
            return true;
        }
        return false;
    }

    public Test get(Long ID){
        return MOCKED_DB.get(ID);
    }

    public List<Test> listAll(){
        return Lists.newArrayList(MOCKED_DB.values());
    }

}
