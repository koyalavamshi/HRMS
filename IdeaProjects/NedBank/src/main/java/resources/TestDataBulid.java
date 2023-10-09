package resources;

import pojo.AddData;
import pojo.AddSupport;
import pojo.postName;

public class TestDataBulid {
    public postName UserData(String firstName,String lastName) {
        AddData d = new AddData();
        d.setId(5);
        d.setAvatar("https://reqres.in/img/faces/2-image.jpg");
        d.setFirst_name(firstName);
        d.setLast_name(lastName);
        d.setEmail("janet.weaver@reqres.in");

        AddSupport s = new AddSupport();
        s.setUrl("https://reqres.in/#support-heading");
        s.setText("To keep ReqRes free, contributions towards server costs are appreciated!");

        postName p = new postName();
        p.setData(d);
        p.setSupport(s);
        return p;

    }
}
