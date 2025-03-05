package src.creational.abstractfactory;

public interface AbstractFactory<T>  {
    T create(String type);
}
