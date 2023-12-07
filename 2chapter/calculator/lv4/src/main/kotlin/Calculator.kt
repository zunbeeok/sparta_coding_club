// 클래스 생성시 의존성 주입에 따른 다른 클래스를 생성 하기 위해 기본생성자로 추상클래스인 AbstractOperation을 받는다.
class Calculator (private val abstractOperation: AbstractOperation){
    fun oper(a:Double,b:Double):Double{
        return abstractOperation.oper(a,b);
    }
}