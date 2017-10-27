package com.app.data;

import com.app.bean.Disc;

public interface DiscDao {

    public void addDisc(Disc disc);

    public void removeDisc(Disc disc);


    public Disc findDiscByAuthor(String author);
}
