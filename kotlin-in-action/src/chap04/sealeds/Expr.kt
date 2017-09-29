package chap04.sealeds

sealed class Expr {
    class Num(val value:Int):Expr(){
        override fun toString(): String {
            return "Num(value=$value)"
        }
    }
    class Sum(val left:Expr,val right:Expr):Expr() {
        override fun toString(): String {
            return "Sum(left=$left, right=$right)"
        }
    }
}


