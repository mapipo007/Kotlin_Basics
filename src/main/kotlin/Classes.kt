fun main() {
    val tv = SmartDevice(
        brand = "Samsung TV",
        price = 1000.00,
    )
    println("${tv.brand}, ${tv.price}")
    tv.turnOn()
    tv.getDeviceState()

    tv.turnOff()
    tv.getDeviceState()
    println(tv)

    val phone = SmartDevice()
    // we pass nothing inside because we have
    // used the null checked in the constructor
    phone.brand = "Apple iphone"
    phone.price = 1200.00
    println("${phone.brand}, ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()

    phone.turnOn()
    phone.getDeviceState()
    println(phone)

}

// blueprint
class SmartDevice (
    // properties are in the constructor
    var brand: String? = null,
    var price: Double? = null,
    var isSwitchedOn: Boolean = false
) {
    // behaviors(methods or functions)

    fun getDeviceState() {
        println("$brand is on: $isSwitchedOn")
    }
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on...")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off...")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

}