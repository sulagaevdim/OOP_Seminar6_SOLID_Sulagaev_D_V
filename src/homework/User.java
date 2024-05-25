package homework;

import homework.util.Persister;
import homework.util.Persisterable;
import homework.util.Reporter;

import javax.jws.soap.SOAPBinding;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(){ Persister.save(this);
    }

    public void report(){
        Reporter.report(this);
    }
}
