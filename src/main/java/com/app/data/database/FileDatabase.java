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

    private Map<String,Map<Long, Object>> map;

    public void add(String database, Long id, Object data){
       map.get (database).put (id, data);
    }

    public Object find(String database, Long id){
        return map.get (database).get (id);
    }

    public Long getIncrement(String database){
        return Long.valueOf (map.get (database).size ()+1);
    }

    public List<Object> returnAll(String database){
        return map.get (database).values ().stream ().collect(Collectors.toList());
    }

    public FileDatabase createDatabase (String tableName){
        if(map.containsKey (tableName))
            return instance;
        Map database = new HashMap ();
        map.put (tableName, new HashMap<> ());
        return instance;
    }
}
