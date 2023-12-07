
    fun main(args: Array<String>) {
        //클래스를 한번만 생성
//    val cal = Calculator(); //클래스를 인스턴스화  (클래스가 메모리에 등록된 상태)

        println("첫번째 값을 입력해주세요.")
        val a = readLine()!!.toDouble();

        println("부호를  입력해주세요.")
        val oper: String = readLine()!!;

        println("두번째 값을 입력해주세요.")
        val b = readLine()!!.toDouble();


//    var operation:AbstractOperation=AbstractOperation();

//    //연사자별로 +,-,*,/
//    //아래 if문 중첩이 싫어서 팩토리 패턴으로 개발
//    if(oper == "+"){
//        println(Calculator(AddOperation()).oper(a,b));
//    }else if(oper == "-"){
//        println(Calculator(SubtractOperation()).oper(a,b));
//    }else if(oper == "*"){
//        println(Calculator(MultiplyOperation()).oper(a,b));
//    }else if(oper == "/"){
//        println(Calculator(DivideOperation()).oper(a,b));
//    }else{
//        println("부호가 잘못 입력 되었습니다.")
//    }


        //팩토리 패턴 전에 유효성 검사.
        if (oper != "+" && oper != "-" && oper != "*" && oper != "/") {
            println("잘못 된 수식이 입력 되었습니다.");
            return Unit;
        }

        // !!는 null이 오지 않는다고 컴파일러에게 전달하는용. 에러가 발생하지 않게 유효성 검사를 확실히 하자.
        var calculation: Calculator = CalculatorFactory().createCal(oper)!!

        println(calculation.oper(a, b));

    }
