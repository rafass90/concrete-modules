package com.app.data.database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileDatabase {

    private static FileDatabase instance;

    private FileDatabase (){
        map = new HashMap<> ();
    }

    public static FileDatabase getInstance(){
        if(instance == null)
            instance = new FileDatabase ();
        return instance;
    }

    private Map<Long, Object> map;

    public void add(Long id, Object data){
        map.put (id, data);
    }

    public Object find(Long id){
        return map.get (id);
    }

    public int getIncrement(){
        return map.size ()+1;
    }

    public List<Object> returnAll(){
        return map.values ().stream ().collect(Collectors.toList());
    }
}
