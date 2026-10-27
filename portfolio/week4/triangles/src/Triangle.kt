// COMP2850 Portfolio: Week 4
// Triangle class


import kotlin.math.sqrt
class Triangle(val sideA:Double,val sideB:Double,val sideC:Double){
     private val firstSide=sideA
    private val secondSide=sideB
    private val thirdSide=sideC
        init{
        require((firstSide+secondSide>thirdSide && firstSide+thirdSide>secondSide &&secondSide+thirdSide>firstSide)){"Invalid Triangle" }
        }

    val perimeter:Double get()=firstSide+secondSide+thirdSide
    val semiPerimeter:Double get()=perimeter/2
    val area:Double get()=sqrt(semiPerimeter*(semiPerimeter-firstSide)*(semiPerimeter-secondSide)*(semiPerimeter-thirdSide))

    override fun toString():String{
        return "Triangle($firstSide, $secondSide, $thirdSide)"
    }


}