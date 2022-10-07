package thread;
class Static3type {
static int a=m1();

//static block
static{
	System.out.println("inside static block");
}
static int m1(){
	System.out.println("from m1");
	return 20;
}


}
