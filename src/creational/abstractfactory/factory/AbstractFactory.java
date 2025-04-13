package src.creational.abstractfactory.factory;

public interface AbstractFactory<T>  {
    T create(String type);
}
