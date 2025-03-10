package src.creational.abstractfactory.creator;

public interface AbstractFactory<T>  {
    T create(String type);
}
