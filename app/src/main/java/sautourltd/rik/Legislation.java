package sautourltd.rik;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by su on 09/09/2017.
 */

public class Legislation {
    private String name = "MiFID II";
    private Date date = new Date();
    private List<LegislationText> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<LegislationText> getList() {
        return list;
    }

    public void setList(List<LegislationText> list) {
        this.list = list;
    }
}
