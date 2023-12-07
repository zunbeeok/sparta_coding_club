// 계산기의 oper기능을 가진 최상위 클래스. Calculator클래스는 직접적인 서비스(add, sub, mul, div)를 바라보지 않는다.
// 오직 AbstractOperation 클래스만 바라보며 인자값과 return만 알게 된다.
abstract class AbstractOperation {
    abstract fun oper(a:Double,b:Double):Double;
}