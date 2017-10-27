package com.app.data;

import com.app.bean.Disc;

import java.util.List;

public interface DiscDao {

    public Long addDisc(Disc disc);

    public void removeDisc(Disc disc);


    public List<Disc> findDiscByAuthor(String author);
}
