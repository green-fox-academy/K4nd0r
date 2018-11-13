package comp.greenfox;

public class Counter {

  int field = 0;

  Counter(){}

  void add(int number){
    field = field + number;
  }

  int add(){
    return field++;
  }

  int get(){

    return field;
  }

  int reset(){
    return field = 0;
  }
}
