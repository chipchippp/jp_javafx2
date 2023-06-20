package daopattern;

import java2fx.Student;
import java2fx.Subject;

import java.util.ArrayList;

public class SubjectRepository implements IRepository<Subject> {
    // singleton
    private static SubjectRepository instance;
    private SubjectRepository(){
    }

    public static SubjectRepository getInstance(){
        if(instance==null){
            instance = new SubjectRepository();
        }
        return instance ;
    }
    @Override
    public ArrayList<Student> getAll() {
        return null;
    }

    @Override
    public Boolean create(Subject subject) {
        return null;
    }

    @Override
    public Boolean update(Subject subject) {
        return null;
    }

    @Override
    public Boolean delete(Subject subject) {
        return null;
    }

    @Override
    public Subject find(Integer id) throws Exception {
        return null;
    }
}
