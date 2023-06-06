package daopattern;

import java2fx.Student;

import java.util.ArrayList;

public interface IRepository <S> {
    ArrayList<Student> getAll();
    Boolean create(S s);
    Boolean update(S s);
    Boolean delete(S s);
    S find(Integer id) throws Exception;

}
