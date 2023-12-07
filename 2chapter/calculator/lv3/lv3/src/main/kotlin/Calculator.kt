class Calculator{

    fun add(a:Double, b:Double):Double{
        val addOperation:AddOperation = AddOperation(); // 의존성이 강한 코드
//    fun add(a:Double, b:Double,addOperation:AddOperation):Double{
        return addOperation.oper(a,b);
    }

//    fun sub(a:Double, b:Double):Double{
//        val subtractOperation:SubtractOperation = SubtractOperation(); // 의존성이 강한 코드
    fun sub(a:Double, b:Double, subtractOperation: SubtractOperation):Double{
        return subtractOperation.oper(a,b);
    }

//    fun mul(a:Double, b:Double):Double{
//        val multiplyOperation :MultiplyOperation = MultiplyOperation(); // 의존성이 강한 코드
    fun mul(a:Double, b:Double, multiplyOperation: MultiplyOperation):Double{
        return multiplyOperation.oper(a,b);
    }

//    fun div(a:Double, b:Double):Double{
//        val divideOperation:DivideOperation = DivideOperation(); // 의존성이 강한 코드
    fun div(a:Double, b:Double, divideOperation: DivideOperation):Double{
        return divideOperation.oper(a,b);
    }
}


//함수에서는
