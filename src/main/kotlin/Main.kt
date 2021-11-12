fun minNumberOfCombinations (numList: Array<Int>, elementsOflist: Int, searchedSum: Int ): Int{


    if(searchedSum <= 0){
        return -1
    }


    numList.sort()
    var solutionList: MutableList<Int> = mutableListOf<Int>()
    var sum: Int = 0;
    var i: Int = elementsOflist - 1
    var c: Int

    while(i >= 0 && sum < searchedSum){
        c = numList[i]


        while(c+sum <= searchedSum){
            solutionList.add(c)
            sum += c
        }


        i -= 1
    }

    if (sum == searchedSum){
        var solution: Int = solutionList.count()
        return solution
    }

    else{
        return -1
    }
}

fun main() {
    val numberList: Array<Int> = arrayOf(2,5,1,4,6)
    val numberOfElements: Int = numberList.count()
    val searchedSum: Int = 5
    val solution: Int = minNumberOfCombinations(numberList,numberOfElements,searchedSum)
    println("$solution")
}