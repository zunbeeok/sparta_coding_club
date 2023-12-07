// Main에 if문 중첩한게 보기 싫어서 만든 Factory 패턴  ( 디자인패턴 - 팩토리패턴)
class CalculatorFactory {
    fun createCal(symbol:String):Calculator?{
        return when(symbol){
            "+" -> Calculator(AddOperation());
            "-" -> Calculator(SubtractOperation());
            "*" -> Calculator(MultiplyOperation());
//            else -> Calculator(DivideOperation());
            "/" -> Calculator(DivideOperation());
            else -> null

        }
    }
}