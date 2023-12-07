fun main(){
    println("첫번째 숫자를 입력해주세요.");
    val a : Double= readLine()!!.toDouble();

    println("수행할 기능을 입력해주세요 ( + , - , * , / )");
    val oper = readLine();

    if( oper != "+" && oper != "-" && oper != "*" && oper != "/"){
        println("잘못된 기호가 입력 되었습니다. 종료합니다.");
        return;
    }

    println("마지막 숫자를 입력해주세요.")
    val b = readLine()!!.toDouble();

    println("계산된 값 : "+cal(oper,a,b));

}

fun add(a:Double,b:Double):Double{
    return a+b;
}

fun min(a:Double, b:Double):Double{
    return a-b;
}

fun mul(a:Double,b:Double):Double{
    return a*b;
}

fun div(a:Double, b:Double):Double{
    return  a/b;
}


fun cal( oper: String, a: Double, b:Double):Double{
    var v:Double = 0.0;
    if(oper == "+"){
        v = a + b;
    }else if(oper =="-"){
        v = a - b;
    }else if(oper =="*"){
        v =  a * b;
    }else{
        v = a / b;
    }
    return v;
}