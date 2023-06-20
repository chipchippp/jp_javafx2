package factory;

import daopattern.IRepository;
import daopattern.StudentRepository;
import daopattern.SubjectRepository;
import enums.RepositoryType;

public class RepositoryFactory {
    public static IRepository createRepositoryInstance(RepositoryType type){
        if (type == RepositoryType.SUBJECT)
            return SubjectRepository.getInstance();
        else if (type == RepositoryType.STUDENT) {
            return StudentRepository.getInstance();

        }
        return null;
    }


}
