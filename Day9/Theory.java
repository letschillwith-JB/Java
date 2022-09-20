package Day9;

public class Theory {
//Q4) Explain the difference between overloading and overriding methods with an example?
    /*Overloading means:-
    similar method or constructor is is written in the same class with different parmeter
     for example:-
     */
    void Method1(){
        //Method 1 with no parameter
    }
    void Method1(int x){
        //this is method overloding
        //Method1 with int parameter;
    }

    /*
    whereas method overriding means writing same method with same parameter in child class
    for example
     */
    void Method2(String name){

    }
}
class Abc extends Theory{
    @Override
    void Method2(String name){
        //this is an example of overriden method.
    }
}