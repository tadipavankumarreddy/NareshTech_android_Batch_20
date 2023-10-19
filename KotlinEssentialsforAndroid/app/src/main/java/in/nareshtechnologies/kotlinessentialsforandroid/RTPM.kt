package `in`.nareshtechnologies.kotlinessentialsforandroid

abstract class RBI{

    /***This function is not open to override - so all banks that fall under RBI
     * Should be implementing the same interest rate
     */
    fun homeLoanInterestRate():Double{
       return 7.65;
    }

    abstract fun personalLoan():Double
}

class SBI:RBI(){
    override fun personalLoan(): Double {
        return 6.2;
    }
}

class ICICI:RBI(){
    override fun personalLoan(): Double {
        return 7.8;
    }

}
