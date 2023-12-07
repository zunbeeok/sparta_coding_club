fun main(args: Array<String>) {
    //클래스를 한번만 생성
    val cal = Calculator(); //클래스를 인스턴스화  (클래스가 메모리에 등록된 상태)

    println("첫번째 값을 입력해주세요.")
    val a = readLine()!!.toDouble();

    println("부호를  입력해주세요.")
    val oper = readLine();

    println("두번째 값을 입력해주세요.")
    val b = readLine()!!.toDouble();



//    //연사자별로 +,-,*,/
//    if(oper == "+"){
//        println(cal.add(a,b));
//    }else if(oper == "-"){
//        println(cal.sub(a,b))
//    }else if(oper == "*"){
//        println(cal.mul(a,b))
//    }else if(oper == "/"){
//        println(cal.div(a,b))
//    }else{
//        println("부호가 잘못 입력 되었습니다.")
//    }

    //연사자별로 +,-,*,/
    if(oper == "+"){
                println(Calculator().add(a,b));
//        println(Calculator().add(a,b,AddOperation()));
    }else if(oper == "-"){
        println(Calculator().sub(a,b,SubtractOperation()));
    }else if(oper == "*"){
        println(Calculator().mul(a,b,MultiplyOperation()));
    }else if(oper == "/"){
        println(Calculator().div(a,b,DivideOperation()));
    }else{
        println("부호가 잘못 입력 되었습니다.")
    }

}