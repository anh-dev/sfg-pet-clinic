package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T,ID> {

    Set<T> findAll();

    T findById(ID od);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
